/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A job schedule that allows recurring jobs by specifying when to run jobs
 * and a specification used to create each job.
 */
public class JobScheduleAddParameter {
    /**
     * Gets or sets a string that uniquely identifies the schedule within the
     * account. A GUID is recommended.
     */
    @JsonProperty(required = true)
    private String id;

    /**
     * Gets or sets the display name for the schedule.
     */
    private String displayName;

    /**
     * Gets or sets the schedule according to which jobs will be created.
     */
    @JsonProperty(required = true)
    private Schedule schedule;

    /**
     * Gets or sets the details of the jobs to be created on this schedule.
     */
    @JsonProperty(required = true)
    private JobSpecification jobSpecification;

    /**
     * Gets or sets a list of name-value pairs associated with the schedule as
     * metadata.
     */
    private List<MetadataItem> metadata;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Get the schedule value.
     *
     * @return the schedule value
     */
    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule value.
     *
     * @param schedule the schedule value to set
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Get the jobSpecification value.
     *
     * @return the jobSpecification value
     */
    public JobSpecification getJobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Set the jobSpecification value.
     *
     * @param jobSpecification the jobSpecification value to set
     */
    public void setJobSpecification(JobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     */
    public void setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
    }

}
