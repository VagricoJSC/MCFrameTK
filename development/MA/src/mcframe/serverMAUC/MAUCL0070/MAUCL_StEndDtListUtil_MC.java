package mcframe.serverMAUC.MAUCL0070;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;

import mcframe.commonCore.util.MCCollectionUtil;

/**
 * "MAUCL_StEndDtListUtil"ロジッククラスです。
 * <p>
 */
public class MAUCL_StEndDtListUtil_MC<E extends MCRow>  {
	/**  */
	protected MCList<E> _list;

	/**
	 * ソート済みかどうか
	 */
	protected boolean _isSorted = false;

	/** キー項目。但し使用開始日は含まない */
	protected String[] _keyCols;

	/** 使用開始日のカラム名 */
	protected String _stDtCol;

	/** 使用停止日のカラム名 */
	protected String _endDtCol;

	/** キー項目＋使用開始日のカラム */
	protected String[] _keyWithSt;

	// セットアップ関連（ここから）
	public void setList(MCList<E> list) {
		_isSorted = false;
		if (list == null) {
			_list = null;
		}
		else {
			_list = list.clone();
		}
	}

	public void setEndDtCol(String endDtCol) {
		_endDtCol = endDtCol;
	}

	public String getEndDtCol() {
		return _endDtCol;
	}

	public void setStDtCol(String stDtCol) {
		if (stDtCol == null) {
			_stDtCol = null;
			_keyWithSt = null;
		}
		else {
			_stDtCol = stDtCol;
			regeneKeyWithSt();
		}
	}

	public String getStDtCol() {
		return _stDtCol;
	}

	public void setKeyCols(String... keyCols) {
		if (keyCols == null) {
			_keyCols = new String[0];
		}
		_keyCols = keyCols;
		regeneKeyWithSt();
	}

	protected void regeneKeyWithSt() {
		if (_stDtCol == null) return;
		_keyWithSt = MCCollectionUtil.concat(_keyCols, new String[] {
			_stDtCol
		});
	}

	protected void regeneIdx() {
		if (_keyCols == null) {
			return;
		}
		if (_list == null) {
			return;
		}
		if (_stDtCol == null) {
			return;
		}
	}

	// セットアップ関連（ここまで）
	/**
	 * 適用日に有効なRowを返します。
	 */
	@SuppressWarnings("unchecked")
	public E getRow(MCRow bind, MCDate dt) {
		if (_list == null || _keyWithSt == null) return null;
		if (!_isSorted) {
			_list.sort(new MCRowComparator.DESC<E>(_keyWithSt));
			_isSorted = true;
		}
		boolean isFound = false;
		for (E row : _list) {
			if (!isColSame(bind, _keyCols, row, _keyCols)) {
				if (isFound) {
					break;
				}
				continue;
			}
			isFound = true;
			if (dt.gte(row.getDate(_stDtCol))) {
				if (dt.lte(row.getDate(_endDtCol))) {
					// 以下のキャストの警告は不可避
					return (E) row.clone();
				}
			}
		}
		return null;
	}

	/**
	 * 引数のRowの開始日／停止日の期間と重複するRowがある場合、そのRowのリストを
	 * 返します。
	 * @param bind
	 * @return 期間が重複するリスト。開始日の昇順でソートされている。 
	 * bind がnullの場合null。bindの開始日あるいは終了日の値がnullの
	 * 場合null。ユーティリティが正しくセットアップされていない場合null。
	 */
	public MCList<E> getOverlap(E bind) {
		if (_list == null || _keyWithSt == null) return null;
		if (bind == null) return null;
		if (!_isSorted) {
			_list.sort(new MCRowComparator.DESC<E>(_keyWithSt));
			_isSorted = true;
		}

		MCList<E> ans = MCList.create(bind);
		MCDate stDt = bind.getDate(_stDtCol);
		MCDate endDt = bind.getDate(_endDtCol);
		if (stDt == null || endDt == null) return null;
		boolean isFound = false;
		for (int i = _list.size() - 1; i >= 0; i--) {
			E row = _list.get(i);
			if (!isColSame(bind, _keyCols, row, _keyCols)) {
				if (isFound) {
					break;
				}
				continue;
			}
			isFound = true;
			if (endDt.lte(row.getDate(_stDtCol))) {
				continue;
			}
			if (stDt.gte(row.getDate(_endDtCol))) {
				continue;
			}
			ans.add(row);
		}
		return ans;
	}

}

