ifkeyboard BFBE		# IBM Model M-122
ifset set3				# IBM terminal protocol

remapblock
layer 0
	LANG_4 	 			DOWN	 	  # Middle of + nav
	EUROPE_2 			BACKSLASH # \| key beside LSHIFT
	EUROPE_1 			BACKSLASH # \| key beside ENTER
	CAPS_LOCK			LGUI 			# Caps lock -> win

	# Terminal F1 - F10
	EXTRA_F1 			ESC
	EXTRA_F2			ESC
	# EXTRA_F3			A  									# Used by macro?
	# EXTRA_F4			A  									# Used by macro?
	# EXTRA_F5			A  									# Used by macro?
	# EXTRA_F6			A  									# Used by macro?
	# EXTRA_F7			A  									# Used by macro?
	# EXTRA_F8			A  									# Used by macro?
	EXTRA_F9			LGUI
	EXTRA_F10			RGUI

	# Terminal numpad jiggery
	ESC						NUM_LOCK
	NUM_LOCK			PAD_SLASH
	SCROLL_LOCK		PAD_ASTERIX
	EXTRA_SYSRQ		PAD_MINUS
	PAD_ASTERIX		PAD_PLUS
	PAD_MINUS			PAD_PLUS
	PAD_PLUS			PAD_ENTER

	# Top-row F-keys
  F13						ESC
	F14						MEDIA_VOLUME_DOWN
	F15						MEDIA_VOLUME_UP
	F16						MEDIA_MUTE
	F17						MEDIA_PLAY_PAUSE
	F18						MEDIA_PREV_TRACK
	F19						MEDIA_NEXT_TRACK
	# F20						A  									# Used by macro?
	# F21 					A  									# Used by macro?
	F22 					PRINTSCREEN
	F23						SCROLL_LOCK
	F24 					PAUSE
endblock
