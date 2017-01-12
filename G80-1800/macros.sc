# Macros
macroblock
  macro F20
    PUSH_META CLEAR_META all    # save and clear all metas
    PRESS p                     # press some keys...
    PRESS I
    PRESS N                     # case is ignored - this results in lowercase 'n'
    SET_META lshift             # you have to set modifiers yourself
    PRESS g                     # results in a capital 'G', since shift is set
    POP_ALL_META                # restore metas that were active before
  endmacro

	# Terminal F3 = Win+Space -- Spotlight (OSX) / Input language (windows)
  macro EXTRA_F3
    PUSH_META CLEAR_META all    # save and clear all metas
    SET_META LGUI               # you have to set modifiers yourself
    PRESS    SPACE              # results in a capital 'G', since shift is set
    POP_ALL_META                # restore metas that were active before
  endmacro
endblock
