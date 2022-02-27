numeroF(0,1).

numeroF(Q,R)
:- V is Q-1,numeroF(V,R1),
    R is Q*R1.

