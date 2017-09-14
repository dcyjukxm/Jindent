// PREfast sample

__checkReturn
__drv_allocatesMem(Pool)
__drv_when(PoolType&0x1f==2 || PoolType&0x1f==6,
__drv_reportError("Must succeed pool allocations are"
"forbidden. Allocation failures cause a system crash"))
__bcount(NumberOfBytes)
PVOID
  ExAllocatePoolWithTag(
    __in __drv_strictTypeMatch(__drv_typeExpr)
    POOL_TYPE PoolType,
    __in SIZE_T NumberOfBytes,
    __in ULONG Tag
    );

NTKERNELAPI
VOID
  ExFreePoolWithTag(
    __in __drv_in(__drv_freesMem(Pool))
    PVOID P,
    __in ULONG  Tag
    );
