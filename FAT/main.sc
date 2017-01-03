# Billy's AT layout

remapblock
    # Standard things: esc + media on LHS
    F1         ESC
    F2         ESC
    F3         MEDIA_MEDIA_SELECT
    F4         MEDIA_PLAY_PAUSE
    F5         MEDIA_PREV_TRACK
    F6         MEDIA_NEXT_TRACK
    F7         MEDIA_VOLUME_DOWN
    F8         MEDIA_VOLUME_UP
    F9         APP
    F10        LGUI
    # Complex remapping
    # Soarer's docs say that we have the following remap codes available to us:
    # EXTRA_LALT      0xB1    AT-F extra pad lhs of space
    # EXTRA_PAD_PLUS  0xB2    Term extra pad bottom of keypad +
    # EXTRA_RALT      0xB3    AT-F extra pad rhs of space
    # EXTRA_EUROPE_2  0xB4    AT-F extra pad lhs of enter
    # EXTRA_BACKSLASH 0xB5    AT-F extra pad top of enter
    # EXTRA_INSERT    0xB6    AT-F extra pad lhs of Insert

    # Top of BAE becomes ANSI \|
    EXTRA_BACKSLASH     BACKSLASH

    # Bottom right of 60% cluster -> GUI
    CAPS_LOCK       LGUI

    # Numpad
    # AT numpad looks like this:
    #     Esc     NumLk   ScrLk   SysRq
    #     Pad7    Pad8    Pad9    PtrSc
    #     Pad4    Pad5    Pad6    Pad-
    #     Pad1    Pad2    Pad3    Pad+
    #     Pad0?   Pad0?   Pad.    EXTRA_PAD_PLUS
    # We want:
    #     Ins     Home    PgUp    ???
    #     Del     End     PgDn    ???
    #     ???     ???     ???     ???
    #     Fn      Up      ???     ???
    #     Left    Down    Right   ???
    ESC         INSERT
    NUM_LOCK    HOME
    SCROLL_LOCK PAGE_UP
    PAD_STAR    A
    
    PAD_7       DELETE
    PAD_8       END
    PAD_9       PAGE_DOWN 
    FAKE_19     A # SysRq is special: FAKE_19
    
    PAD_4       A
    PAD_5       A
    PAD_6       A
    PAD_MINUS   A

    PAD_3       FN1
    PAD_2       UP
    PAD_1       A
    PAD_PLUS    A
    PAD_0       LEFT
    # other_pad_0 down?
    PAD_PERIOD  RIGHT

    #FAKE_06    BACKSLASH
    #LCTRL      FN1
    #LALT       LCTRL
    #FAKE_02    LALT
    #FAKE_04    RALT
    #CAPS_LOCK  RCTRL
    #FAKE_03    PAD_ENTER
    #F11        PAD_ENTER
endblock

layerblock
    FN1 1
endblock

# F1-F12 on numbers with Fn
remapblock
layer 1
    1        F1
    2        F2
    3        F3
    4        F4
    5        F5
    6        F6
    7        F7
    8        F8
    9        F9
    0        F10
    MINUS    F11
    EQUAL    F12
endblock
