package org.jinngm.jvm.anatomy.jmh_generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class LoopRoach_jmhType_B2 extends LoopRoach_jmhType_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater<LoopRoach_jmhType_B2> tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(LoopRoach_jmhType_B2.class, "tearInvocationMutex");

    public volatile boolean readyTrial;
    public volatile boolean readyIteration;
    public volatile boolean readyInvocation;
}
