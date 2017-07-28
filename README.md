# android-multimodule-databinding
POC of build error for multimodule databinding android with parallel execution

Clean build first to ensure there's no cache for databinding generated files.
Try to build with max-workers = 4, parallel = true.

It will failed.

Try to build with max-workers = 1. It will success.
Now after the databinding cache is there, if we build with max-workers = 4. It will succeed.
