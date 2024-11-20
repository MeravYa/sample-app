# Steps to Reproduce

1. Change inside the config map the SAMPLE_CONFIG_PROPERTY value and apply the changes
2. Apply the /actuator/refresh endpoint manually (or using spring cloud watcher)
3. Check the application /actuator/env endpoint - property change would not be applied