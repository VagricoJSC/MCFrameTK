package mcframe.clientMAUD.MAUDP1020;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientMAUD.MAUDP1010.MAUDP_RLDeleter;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.notice.MCAppException;
import static mcframe.commonMA.notice.MA_Msg.*;

public class MAUDP_LCLRLDeleter_MC<P extends MAUDP_LCLRLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLDeleter<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_LCLRLDeleter_MC(P panel, O operation) {
		super(panel, operation);
	}

	/**
	 * {@link #getCheckedRows()}の戻り値のRowの型を指定することができるメソッドです。
	 *
	 * @param <E> {@link #getCheckedRowListBlock()}で指定したリストのRowクラス又はそのスーパークラス
	 * @param clazz 戻り値のRowクラス
	 * @return {@link #getCheckedRows()}参照
	 */
	@SuppressWarnings("unchecked")
	// return のところのキャスト
	public <E extends MCConstRow> MCList<E> getLClCheckedRows(Class<E> clazz) {
		MCList<? extends MCConstRow> ls = getLclCheckedRows();
		if (ls != null && !ls.isEmpty() && clazz != null) {
			MCConstRow r = ls.get(0);
			if (!clazz.isInstance(r)) {
				throw new MCAppException(MAUDP0039, r.getClass().getName(),
						clazz.getName());
			}
		}
		return (MCList<E>) ls;
	}

	/**
	 * 対象データ存在チェック。対象が無ければエラーメッセージを表示。
	 */
	protected boolean checkLclCheckedRowSize() {
		if (getLclCheckedRows().isEmpty()) {
			panel.dialog(msgNoDataChange());
			return false;
		}
		return true;
	}

	/**　対象データ格納用 */
	private MCList<? extends MCConstRow> _lclPickedList;

	/**
	 * {@link #getCheckedRowListBlock()}で指定したブロックの中で {@link #getCheckColumn()}で指定された
	 * カラムが true の行を集めたリストを返します。
	 *
	 * @return
	 */
	public MCList<? extends MCConstRow> getLclCheckedRows() {
		if (_lclPickedList == null) {
			_lclPickedList = getLclCheckedRowList().subList(getCheckColumn(), true);
		}
		return _lclPickedList;
	}

	/**
	 * 対象のリストの画面コンテナを返す。
	 */
	@SuppressWarnings("unchecked")
	protected MCList<? extends MCConstRow> getLclCheckedRowList() {
		return (MCList<? extends MCConstRow>) getUpBlocks().get(
				getLclCheckedRowListBlock());
	}

	/**
	 * 「削除対象の行にチェック」をするリストの上り電文のブロック番号（デフォルトは「0」）
	 */
	protected int getLclCheckedRowListBlock() {
		return 1;
	}
}
