package com.vinod.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {

/*	@Before("execution(public void teacherMethod())")
	public void msg1() {
		System.out.println("We are in Before Method");
	}
	
	@Before("execution(public void studentMethod())")
	public void msg2() {
		System.out.println("We are in Before Method");
	}

*/
/*	@Before("execution(public void *Method())")
	public void msg3() {
		System.out.println("We are in Before Method");
	}

	@After("execution(public void studentMethod())")
	public void msg4() {
		System.out.println("We are in After Method");
	}
*/	

/*	
  	// @Before("execution(public void studentMethod())")
	@Before("msg7()")
	public void msg5() {
		System.out.println("We are in Before Method");
	}

  	// @After("execution(public void studentMethod())")
	@After("msg7()")
	public void msg6() {
		System.out.println("We are in After Method");
	}
	
	@Pointcut("execution(public void studentMethod())")
	public void msg7() {}
*/
	
	@Around("execution(public void studentMethod())")
	public void msg8(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("We are in around's Before Method");
		pjp.proceed();
		System.out.println("We are in around's After Method");
	}
}


//-------
/*
@Aspect

@Before

@After

@Around

*
Vinod
Vimal
Don
Komal
Rahul
Aliya

SEARCH = 

*o* = komal

Vi* => Viabc

public void teacherMethod()
public void studentMethod()

public void *Method()


	VimalBorse
	VinumalBorse

	Vi*malBorse
	Vi*Borse

 	*mal*

public void teacherMethod()
public void studentMethod()

public void *Method()

-------------------
public void teacherMethod()
private void studentMethod()

* **

* void *Method()
select * from studentTable where name = 'vinod';

select st.* from studentTable st
inner join teacherTable tt on tt.id = st.teacher_id
where st.name = 'vinod';

*/