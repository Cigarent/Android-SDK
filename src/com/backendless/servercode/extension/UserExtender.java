package com.backendless.servercode.extension;

import com.backendless.commons.exception.ExceptionRepresentation;
import com.backendless.property.UserProperty;
import com.backendless.servercode.ExecutionResult;
import com.backendless.servercode.RunnerContext;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ivanlappo
 * Date: 5/20/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class UserExtender
{
  public UserExtender()
  {
  }

  public void beforeLogin( RunnerContext context, String login, String password ) throws Exception
  {
  }

  public HashMap afterLogin( RunnerContext context, String login, String password,
                             ExecutionResult<HashMap> userValues ) throws Exception
  {
    return userValues.getResult();
  }

  public void beforeRegister( RunnerContext context, HashMap userValue ) throws Exception
  {
  }

  public HashMap afterRegister( RunnerContext context, HashMap userValue,
                                ExecutionResult<HashMap> savedValue ) throws Exception
  {
    return savedValue.getResult();
  }

  public void beforeUpdate( RunnerContext context, HashMap userValue ) throws Exception
  {
  }

  public HashMap afterUpdate( RunnerContext context, HashMap userValue,
                              ExecutionResult<HashMap> savedValue ) throws Exception
  {
    return savedValue.getResult();
  }

  public void beforeRemove( RunnerContext context, String id ) throws Exception
  {
  }

  public Long afterRemove( RunnerContext context, String id, ExecutionResult<Long> removedLong ) throws Exception
  {
    return removedLong.getResult();
  }

  public void beforeDescribe( RunnerContext context ) throws Exception
  {
  }

  public List<UserProperty> afterDescribe( RunnerContext context,
                                           ExecutionResult<List<UserProperty>> properties ) throws Exception
  {
    return properties.getResult();
  }

  public void beforeRestorePassword( RunnerContext context, String email ) throws Exception
  {
  }

  public void afterRestorePassword( RunnerContext context, String email,
                                    ExceptionRepresentation exceptionRepresentation ) throws Exception
  {
  }

  public void beforeLogout( RunnerContext context ) throws Exception
  {
  }

  public void afterLogout( RunnerContext context, ExceptionRepresentation exceptionRepresentation ) throws Exception
  {
  }
}
