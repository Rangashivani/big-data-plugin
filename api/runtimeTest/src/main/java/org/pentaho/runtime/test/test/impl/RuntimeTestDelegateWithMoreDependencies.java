/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.runtime.test.test.impl;

import org.pentaho.runtime.test.RuntimeTest;
import org.pentaho.runtime.test.result.RuntimeTestResultSummary;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bryan on 8/17/15.
 */
public class RuntimeTestDelegateWithMoreDependencies implements RuntimeTest {
  private final RuntimeTest delegate;
  private final Set<String> extraDependencies;

  public RuntimeTestDelegateWithMoreDependencies( RuntimeTest delegate, Set<String> extraDependencies ) {
    this.delegate = delegate;
    this.extraDependencies = new HashSet<>( extraDependencies );
  }

  @Override public boolean accepts( Object objectUnderTest ) {
    return delegate.accepts( objectUnderTest );
  }

  @Override public String getModule() {
    return delegate.getModule();
  }

  @Override public String getId() {
    return delegate.getId();
  }

  @Override public String getName() {
    return delegate.getName();
  }

  @Override public boolean isConfigInitTest() {
    return delegate.isConfigInitTest();
  }

  @Override public Set<String> getDependencies() {
    HashSet<String> set = new HashSet<String>( extraDependencies );
    set.addAll( delegate.getDependencies() );
    return Collections.unmodifiableSet( set );
  }

  @Override public RuntimeTestResultSummary runTest( Object objectUnderTest ) {
    return delegate.runTest( objectUnderTest );
  }

  //OperatorWrap isn't helpful for autogenerated methods
  //CHECKSTYLE:OperatorWrap:OFF
  @Override public String toString() {
    return "RuntimeTestDelegateWithMoreDependencies{" +
      "delegate=" + delegate +
      ", extraDependencies=" + extraDependencies +
      '}';
  }
  //CHECKSTYLE:OperatorWrap:ON
}
