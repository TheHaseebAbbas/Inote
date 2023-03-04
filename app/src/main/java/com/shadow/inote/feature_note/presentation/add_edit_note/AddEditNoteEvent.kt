package com.shadow.inote.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed interface AddEditNoteEvent {
    data class EnteredTitle(val value: String) : AddEditNoteEvent
    data class ChangeTitleFocus(val FocusState: FocusState) : AddEditNoteEvent
    data class EnteredContent(val value: String) : AddEditNoteEvent
    data class ChangeContentFocus(val FocusState: FocusState) : AddEditNoteEvent
    data class ChangeColor(val color: Int): AddEditNoteEvent
    object SaveNote: AddEditNoteEvent
}
