package com.web.application.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.web.application.entity.User_Role;
import com.web.application.model.SearchCriteria;


public class UserRoleSpecification {
		public static Specification<User_Role> findByCriteria(final List<SearchCriteria> searchCriteria){
			return new Specification<User_Role>() {
				@Override
				public Predicate toPredicate(Root<User_Role> root,CriteriaQuery<?> query, CriteriaBuilder cb) {
					List<Predicate> p2 = new ArrayList<>();
					for(int i=0;i<searchCriteria.size();i++) {
						List<Predicate> predicates = new ArrayList<>();
						if(searchCriteria.get(i).getId() != null)	
							predicates.add(cb.equal(root.get("id"), searchCriteria.get(i).getId()));
						if(searchCriteria.get(i).getName() != null)	
							predicates.add(cb.equal(root.get("name"), searchCriteria.get(i).getName()));
						if(searchCriteria.get(i).getEmail_id() != null)	
							predicates.add(cb.equal(root.get("email_id"), searchCriteria.get(i).getEmail_id()));
						p2.add(cb.and(predicates.toArray(new Predicate[predicates.size()])));
					}
					return cb.or(p2.toArray(new Predicate[p2.size()]));
				}
			};
		}
	}



