package net.gotev.uploadservice.exceptions

import net.gotev.uploadservice.UploadThrowable

class UserCancelledUploadException(httpMethod: String) : UploadThrowable(message = "User cancelled upload", httpMethod = httpMethod)
class UploadError(httpMethod: String) : UploadThrowable(message = "Upload error", httpMethod = httpMethod)
