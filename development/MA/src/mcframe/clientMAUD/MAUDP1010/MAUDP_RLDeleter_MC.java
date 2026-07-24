package mcframe.clientMAUD.MAUDP1010;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.commonMA.notice.MA_Msg.*;
import mcframe.clientMAUD.MAUDP0030.MAUDP_RLDeleter;

public class MAUDP_RLDeleter_MC<P extends MAUDP_RLBase, O extends MCCallerPanelBridge>
		extends MAUDP_RLDeleter<P, O> {

	/**
	 * コンストラクタです。
	 *
	 * @param panel 画面
	 * @param operation オペレーション
	 */
	public MAUDP_RLDeleter_MC(P panel, O operation) {
		super(panel, operation);
	}

	@Override
	protected void setupUpParam() {
		for (MCContainer c : getUpBlocks()) {
			if (c == getCheckedRowList()) {
				param().addUpBlock(getCheckedRows());
				continue;
			}
			if (c instanceof MCList) {
				param().addUpBlock(panel.exceptEmpty((MCList<?>) c));
			}
			else {
				param().addUpBlock(c);
			}
		}
	}

	@Override
	protected boolean isUpBlockStatusNone() {
		// ピックアップされたリストの状態でしか判断しません
		// （それ以外の判断は必要なし）
		return (getCheckedRows().size() == 0);
	}

	@Override
	protected boolean checkForCall() {
		if (!checkCheckedRowSize()) {
			return false;
		}
		return super.checkForCall();
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
	public <E extends MCConstRow> MCList<E> getCheckedRows(Class<E> clazz) {
		MCList<? extends MCConstRow> ls = getCheckedRows();
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
	protected boolean checkCheckedRowSize() {
		if (getCheckedRows().isEmpty()) {
			panel.dialog(msgNoDataChange());
			return false;
		}
		return true;
	}

	/**
	 * 対象データが存在しない場合のメッセージ
	 */
	@Override
	public MCMessage msgNoDataChange() {
		return new MCMessage(FXBAP0038);
	}

	/**　対象データ格納用 */
	private MCList<? extends MCConstRow> _pickedList;

	/**
	 * {@link #getCheckedRowListBlock()}で指定したブロックの中で {@link #getCheckColumn()}で指定された
	 * カラムが true の行を集めたリストを返します。
	 *
	 * @return
	 */
	public MCList<? extends MCConstRow> getCheckedRows() {
		if (_pickedList == null) {
			_pickedList = getCheckedRowList().subList(getCheckColumn(), true);
		}
		return _pickedList;
	}

	/**
	 * 対象のリストの画面コンテナを返す。
	 */
	@SuppressWarnings("unchecked")
	protected MCList<? extends MCConstRow> getCheckedRowList() {
		return (MCList<? extends MCConstRow>) getUpBlocks().get(
				getCheckedRowListBlock());
	}

	/**
	 * 「チェック」のカラム名（デフォルトは"check"。）
	 */
	protected String getCheckColumn() {
		return panel.getCheckColumn();
	}

	/**
	 * 「削除対象の行にチェック」をするリストの上り電文のブロック番号（デフォルトは「0」）
	 */
	protected int getCheckedRowListBlock() {
		return 0;
	}
}

