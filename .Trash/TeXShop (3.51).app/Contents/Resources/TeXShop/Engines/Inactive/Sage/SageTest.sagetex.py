## -*- encoding: utf-8 -*-
# This file was *autogenerated* from the file SageTest.sagetex.sage.
from sage.all_cmdline import *   # import sage library
_sage_const_3 = Integer(3); _sage_const_2 = Integer(2); _sage_const_1 = Integer(1); _sage_const_0 = Integer(0); _sage_const_7 = Integer(7); _sage_const_6 = Integer(6); _sage_const_5 = Integer(5); _sage_const_4 = Integer(4); _sage_const_9 = Integer(9); _sage_const_8 = Integer(8); _sage_const_39 = Integer(39); _sage_const_43 = Integer(43); _sage_const_47 = Integer(47); _sage_const_30 = Integer(30); _sage_const_31 = Integer(31); _sage_const_23 = Integer(23); _sage_const_32 = Integer(32); _sage_const_27 = Integer(27); _sage_const_37 = Integer(37)## This file (SageTest.sagetex.sage) was *autogenerated* from SageTest.tex with sagetex.sty version 2012/01/16 v2.3.3-69dcb0eb93de.
import sagetex
_st_ = sagetex.SageTeXProcessor('SageTest', version='2012/01/16 v2.3.3-69dcb0eb93de', version_check=True)
try:
 _st_.inline(_sage_const_0 , latex(_sage_const_32 **_sage_const_31 ))
except:
 _st_.goboom(_sage_const_23 )
try:
 _st_.plot(_sage_const_0 , format='notprovided', _p_=plot(x * sin( _sage_const_30  * x), -_sage_const_1 , _sage_const_1 ))
except:
 _st_.goboom(_sage_const_27 )
try:
 _st_.inline(_sage_const_1 , latex(integrate( (x**_sage_const_2  + x + _sage_const_1 ) / ((x - _sage_const_1 )**_sage_const_3  * (x**_sage_const_2  + x + _sage_const_2 )) )))
except:
 _st_.goboom(_sage_const_32 )
try:
 _st_.inline(_sage_const_2 , latex(matrix([[_sage_const_1 , _sage_const_2 , _sage_const_3 ], [_sage_const_4 , _sage_const_5 , _sage_const_6 ], [_sage_const_7 , _sage_const_8 , _sage_const_9 ]])**_sage_const_3 ))
except:
 _st_.goboom(_sage_const_37 )
try:
 _st_.inline(_sage_const_3 , latex(Matrix([[_sage_const_1 , _sage_const_2 ], [_sage_const_3 , _sage_const_4 ]])))
except:
 _st_.goboom(_sage_const_39 )
try:
 _st_.inline(_sage_const_4 , latex(Matrix([[_sage_const_5 , _sage_const_6 ], [_sage_const_6 , _sage_const_8 ]])))
except:
 _st_.goboom(_sage_const_39 )
try:
 _st_.inline(_sage_const_5 , latex(Matrix([[_sage_const_1 , _sage_const_2 ], [_sage_const_3 , _sage_const_4 ]]) * Matrix([[_sage_const_5 , _sage_const_6 ], [_sage_const_6 , _sage_const_8 ]])))
except:
 _st_.goboom(_sage_const_39 )
try:
 _st_.plot(_sage_const_1 , format='notprovided', _p_=plot(x * ln(x), _sage_const_0 , _sage_const_2 ))
except:
 _st_.goboom(_sage_const_43 )
try:
 _st_.inline(_sage_const_6 , latex(pi * e))
except:
 _st_.goboom(_sage_const_47 )
try:
 _st_.inline(_sage_const_7 , latex(N(pi * e)))
except:
 _st_.goboom(_sage_const_47 )
_st_.endofdoc()
