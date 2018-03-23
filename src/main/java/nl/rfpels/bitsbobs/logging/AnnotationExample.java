//------------------------------------------------------------------------------
// Copyright (c) 2018 Bureau Pels. All Rights Reserved.
//------------------------------------------------------------------------------
package nl.rfpels.bitsbobs.logging;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "AnnotationExample")
public class AnnotationExample {
    public static void main(String[] args) {
        log.info("Hello world!");
    }
}
