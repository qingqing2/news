package news.common.dto.criteria;

import tdh.thunder.common.Pagination;

public class NewCriteria extends Pagination {
    private Integer newTypeId;
    private boolean isAllList;

    public boolean getIsAllList() {
        return isAllList;
    }

    public void setIsAllList(boolean isAllList) {
        this.isAllList = isAllList;
    }

    public Integer getNewTypeId() {
        return newTypeId;
    }

    public void setNewTypeId(Integer newTypeId) {
        this.newTypeId = newTypeId;
    }
}
