package dev.naman.productservicettsevening.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;

//    public BaseModel(Long id, Date createdAt, Date lastUpdatedAt, boolean isDeleted) {
//        this.id = id;
//        this.createdAt = createdAt;
//        this.lastUpdatedAt = lastUpdatedAt;
//        this.isDeleted = isDeleted;
//    }
//
//    public BaseModel() {
//    }
//
//    public static BaseModelBuilder builder() {
//        return new BaseModelBuilder();
//    }
//
//    public static class BaseModelBuilder {
//        private Long id;
//        private Date createdAt;
//        private Date lastUpdatedAt;
//        private boolean isDeleted;
//
//        BaseModelBuilder() {
//        }
//
//        public BaseModelBuilder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public BaseModelBuilder createdAt(Date createdAt) {
//            this.createdAt = createdAt;
//            return this;
//        }
//
//        public BaseModelBuilder lastUpdatedAt(Date lastUpdatedAt) {
//            this.lastUpdatedAt = lastUpdatedAt;
//            return this;
//        }
//
//        public BaseModelBuilder isDeleted(boolean isDeleted) {
//            this.isDeleted = isDeleted;
//            return this;
//        }
//
//        public BaseModel build() {
//            return new BaseModel(this.id, this.createdAt, this.lastUpdatedAt, this.isDeleted);
//        }
//
//        public String toString() {
//            return "BaseModel.BaseModelBuilder(id=" + this.id + ", createdAt=" + this.createdAt + ", lastUpdatedAt=" + this.lastUpdatedAt + ", isDeleted=" + this.isDeleted + ")";
//        }
//    }

//    public Long getId() {
//        return this.id;
//    }
//
//    public Date getCreatedAt() {
//        return this.createdAt;
//    }
//
//    public Date getLastUpdatedAt() {
//        return this.lastUpdatedAt;
//    }
//
//    public boolean isDeleted() {
//        return this.isDeleted;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public void setLastUpdatedAt(Date lastUpdatedAt) {
//        this.lastUpdatedAt = lastUpdatedAt;
//    }
//
//    public void setDeleted(boolean isDeleted) {
//        this.isDeleted = isDeleted;
//    }
}
