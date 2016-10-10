package com.liuluming.generic;

import java.util.List;

/**
 * 通用的service类
 * 
 * @author liuluming
 *
 * @param <T>
 *            Model
 * @param <TE>
 *            ModelExample
 * @param <PK>
 *            Model主键类型
 */
public abstract class GenericServiceImpl<T extends Object, TE extends Object, PK> implements GenericService<T, TE, PK> {

	protected abstract GenericMapper<T, TE, PK> getGenericMapper();

	@Override
	public int deleteByExamplePhysically(TE example) {
		return this.getGenericMapper().deleteByExamplePhysically(example);
	}

	@Override
	public int deleteByPrimaryKeyPhysically(PK id) {
		return this.getGenericMapper().deleteByPrimaryKeyPhysically(id);
	}

	@Override
	public int deleteByPrimaryKeysPhysically(PK[] ids) {
		return this.getGenericMapper().deleteByPrimaryKeysPhysically(ids);
	}

	@Override
	public int deleteByPrimaryKeyLogically(PK id) {
		return this.getGenericMapper().deleteByPrimaryKeyLogically(id);
	}

	@Override
	public int deleteByPrimaryKeysLogically(PK[] ids) {
		return this.getGenericMapper().deleteByPrimaryKeysLogically(ids);
	}

	@Override
	public int insert(T entity) {
		return this.getGenericMapper().insert(entity);
	}

	@Override
	public int insertSelective(T entity) {
		return this.getGenericMapper().insertSelective(entity);
	}

	@Override
	public T selectByPrimaryKey(PK id) {
		return this.getGenericMapper().selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T entity) {
		return this.getGenericMapper().updateByPrimaryKeySelective(entity);
	}

	@Override
	public int updateByPrimaryKey(T entity) {
		return this.getGenericMapper().updateByPrimaryKey(entity);
	}

	@Override
	public List<T> selectByExample(TE entity) {
		return this.getGenericMapper().selectByExample(entity);
	}

	@Override
	public int countByExample(TE example) {
		return this.getGenericMapper().countByExample(example);
	}

	@Override
	public int updateByExampleSelective(T record, TE example) {
		return this.getGenericMapper().updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(T record, TE example) {
		return this.getGenericMapper().updateByExample(record, example);
	}

	@Override
	public List<T> queryAll() {
		return this.getGenericMapper().selectByExample(null);
	}

}
