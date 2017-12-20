//------------------------------------------------------------------------------
// Copyright (c) 2017 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.lambdas;


@FunctionalInterface
public interface NonFunctionalInterface {

    void foo(Number f);

    // If you uncomment the following, this is not a functional interface anymore. Why?
    // Because functional interfaces only have one method that is Override equivalent
    //void foo(Integer i);
}
