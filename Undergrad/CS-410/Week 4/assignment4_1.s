0000000000000000 <main>:
push   %rbp
vmov    %rsp,%rbp
sub    $0x10,%rsp
movl   $0x1,-0x8(%rbp)
cmpl   $0x9,-0x8(%rbp)
jg     a3 <main+0xa3>
movl   $0x1,-0xc(%rbp)
cmpl   $0x9,-0xc(%rbp)
jg     9a <main+0x9a>
mov    -0x8(%rbp),%eax
imul   -0xc(%rbp),%eax
mov    %eax,-0x4(%rbp)
mov    -0x8(%rbp),%eax
mov    %eax,%esi
lea    0x0(%rip),%rdi
callq  41 <main+0x41>
lea    0x0(%rip),%rsi
mov    %rax,%rdi
callq  50 <main+0x50>
mov    %rax,%rdx
mov    -0xc(%rbp),%eax
mov    %eax,%esi
mov    %rdx,%rdi
callq  60 <main+0x60>
lea    0x0(%rip),%rsi
mov    %rax,%rdi
callq  6f <main+0x6f>
mov    %rax,%rdx
mov    -0x4(%rbp),%eax
mov    %eax,%esi
mov    %rdx,%rdi
callq  7f <main+0x7f>
mov    %rax,%rdx
mov    0x0(%rip),%rax
mov    %rax,%rsi
mov    %rdx,%rdi
callq  94 <main+0x94>
addl   $0x1,-0xc(%rbp)
jmp    20 <main+0x20>
addl   $0x1,-0x8(%rbp)
jmpq   f <main+0xf>
mov    $0x0,%eax
leaveq
retq

00000000000000aa <_Z41__static_initialization_and_destruction_0ii>:
push   %rbp
mov    %rsp,%rbp
sub    $0x10,%rsp
mov    %edi,-0x4(%rbp)
mov    %esi,-0x8(%rbp)
cmpl   $0x1,-0x4(%rbp)
jne    f0 <_Z41__static_initialization_and_destruction_0ii+0x46>
cmpl   $0xffff,-0x8(%rbp)
jne    f0 <_Z41__static_initialization_and_destruction_0ii+0x46>
lea    0x0(%rip),%rdi        # ce <_Z41__static_initialization_and_destruction_0ii+0x24>
callq  d3 <_Z41__static_initialization_and_destruction_0ii+0x29>
lea    0x0(%rip),%rdx        # da <_Z41__static_initialization_and_destruction_0ii+0x30>
lea    0x0(%rip),%rsi        # e1 <_Z41__static_initialization_and_destruction_0ii+0x37>
mov    0x0(%rip),%rax        # e8 <_Z41__static_initialization_and_destruction_0ii+0x3e>
mov    %rax,%rdi
callq  f0 <_Z41__static_initialization_and_destruction_0ii+0x46>
nop
leaveq 
retq   

00000000000000f3 <_GLOBAL__sub_I_main>:
push   %rbp
mov    %rsp,%rbp
mov    $0xffff,%esi
mov    $0x1,%edi
callq  aa <_Z41__static_initialization_and_destruction_0ii>
pop    %rbp
retq
