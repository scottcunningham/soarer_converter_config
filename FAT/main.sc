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
    F9         LGUI
    F10        RGUI

    # Top of BAE becomes ANSI \|
    EXTRA_BACKSLASH     BACKSLASH

    # Bottom right of 60% cluster -> GUI
    CAPS_LOCK       LGUI

    # Numpad
    # AT numpad looks like this:
    #     Esc     NumLk   ScrLk   FAKE_19
    #     Pad7    Pad8    Pad9    PAD_ASTERIX
    #     Pad4    Pad5    Pad6    Pad-
    #     Pad1    Pad2    Pad3    Pad+
    #     Ex Ins  Pad0    Pad.    F11
    # We want to emulate a nav cluster:
    #     Ins     Home    PgUp    ???
    #     Del     End     PgDn    ???
    #     ???     ???     ???     ???
    #     Fn      Up      ???     ???
    #     Left    Down    Right   ???
    ESC         INSERT
    NUM_LOCK    HOME
    SCROLL_LOCK PAGE_UP
    FAKE_19     PRINTSCREEN
    # Numpad 2nd row
    PAD_7       DELETE
    PAD_8       END
    PAD_9       PAGE_DOWN
    PAD_ASTERIX MEDIA_PREV_TRACK
    # Numpad 3rd row
    PAD_4       B
    PAD_5       C
    PAD_6       D
    PAD_MINUS   MEDIA_NEXT_TRACK
    # Numpad 4th row
    PAD_1       FN1
    PAD_2       UP
    PAD_3       MEDIA_PLAY_PAUSE
    PAD_PLUS    MEDIA_VOLUME_UP
    # Numpad bottom row
    EXTRA_INSERT LEFT
    PAD_0       DOWN
    PAD_PERIOD  RIGHT
    F11         MEDIA_VOLUME_DOWN

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
