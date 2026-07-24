package mcframe.clientMAUB.MAUBP5310;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;


import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.LinkedHashMap;
import java.util.Map;

import mcframe.clientFXBA.FXBAP0010.*;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter;
import mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter;
import mcframe.clientMAUD.MAUDP0010.MAUDP_Printer;
import mcframe.clientMAUD.MAUDP0010.MAUDP_Updater;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUBP_RtnMsg_D"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUBP_RtnMsg_D_MC extends MAUBP_RtnMsg_D_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_RtnMsg_D_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUBP_RtnMsg_D_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	// 部品初期化処理

	@Override
	protected void partsInit() {
		super.partsInit();

		columnRtnMsg_rtn_sts_typ_nm.setHorizontalAlignment(MCColumnConfig.CENTER);
	}

	@Override
	public void afterCallParts(MCRowMatcher matcher, MCCaller caller) {
		super.afterCallParts(matcher, caller);

		// メッセージ・チェックの設定
		int blockIdx = caller.getDownParamBlockIndex(RtnMsgTable);
		MCList downL = caller.getDownParamList(blockIdx);
		if (caller instanceof MAUDP_Deleter) {
			MAUDP_Deleter deleter = (MAUDP_Deleter) caller;
			setMsg(matcher, deleter, blockIdx, deleter.getParamMessage(), downL);
			setChkOff(deleter, blockIdx, downL);
		}
		else if (caller instanceof MAUDP_Updater) {
			MAUDP_Updater updater = (MAUDP_Updater) caller;
			setMsg(matcher, updater, blockIdx, updater.getParamMessage(), downL);
			setChkOff(updater, blockIdx, downL);
		}
		else if (caller instanceof MAUDP_Printer) {
			MAUDP_Printer printer = (MAUDP_Printer) caller;
			setMsg(matcher, printer, blockIdx, printer.getParamMessage(), downL);
			setChkOff(printer, blockIdx, downL);
		}
		else if (caller instanceof MAUDP_FileImporter) {
			MAUDP_FileImporter importer = (MAUDP_FileImporter) caller;
			setMsg(matcher, importer, blockIdx, importer.getParamMessage(), downL);
		}
	}

	/**
	 * 結果情報を設定する。<br>
	 * 
	 */
	protected <E extends MCRow> void setMsg(MCRowMatcher<E> matcher, FXBAP_Caller caller, int blockIdx,
			MCMessageList msgL, MCList<E> downL) {
		caller.addDownItemNames(blockIdx,
				columnRtnMsg_rtn_sts_typ_nm.getBaseRowColumnName(),
				columnRtnMsg_msg_id.getBaseRowColumnName(),
				columnRtnMsg_msg.getBaseRowColumnName());

		if (downL.isEmpty()) {
			return;
		}
		// 結果の区分名は更新、チェックロジックの結果でしか使われず、検索のオペレーションで設定する必要がないため、
		// 例外的に画面側で設定する
		MAC_RTN_STS_TYP.putNameNE(downL.subList(matcher),
				columnRtnMsg_rtn_sts_typ.getBaseRowColumnName(),
				columnRtnMsg_rtn_sts_typ_nm.getBaseRowColumnName());

		if (msgL != null && !msgL.isEmpty()) {
			Map<MCNumber, MCMessage> msgMap = new LinkedHashMap<>();
			for (MCMessage msg : msgL) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}
				if (causeRow.getParamIndex() != downL.get(0).getParamIndex()) {
					continue;
				}
				int paramRowIdx = causeRow.getParamRowIndex();
				if (paramRowIdx < 0) {
					continue;
				}
				MCNumber key = new MCNumber(paramRowIdx);
				if (!msgMap.containsKey(key)) {
					msgMap.put(key, msg);
				}
			}

			for (MCRow r : downL) {
				MCMessage msg = msgMap.get(MCNumber.valueOf(r.getParamRowIndex()));
				if (msg != null) {
					r.setString(columnRtnMsg_msg_id.getBaseRowColumnName(), msg.getID());
					r.setString(columnRtnMsg_msg.getBaseRowColumnName(), msg.toString());
				}
			}
		}
	}
	/** 
	 * 結果情報部品を持つ下り電文downLに対して、メッセージmsgLのcauseRowの指定カラムの値が一致するもののメッセージ内容を設定する。<br>
	 * 明細枠を複数持つ一覧登録画面で、下段に紐づくエラーメッセージの内容を上段の結果情報に表示するなどの場合に使用する。<br>
	 * 下記例の通り、setMsgの実行後（afterCall、show）に本メソッドを実行する想定である。<br>
	 * 実装例１：
	 * <pre>
	 * &#064;Override
	 * protected void afterCall() {
	 *	super.afterCall();
	 *	int msgDwnBlkIdx = 0;	// 結果情報を持つ明細の下り電文のブロック番号
	 *	MCList<?> downL = getDownParamList(msgDwnBlkIdx); // 下り電文対象のリストのみ
	 *	MCMessageList msgL = getParamMessage();
	 *	String[] downCols = {Rslt1R.#xxx, ...}; // メッセージを設定する対象のリストdownLの紐付けカラム
	 *	String[] causeRowCols = {Rslt2R.#yyy, ...}; // メッセージに紐づくcaseRowの紐付けカラム
	 *	Rslt1_rts_msg_p_PPanel.setMsgByKeyCols(downL, downCols, msgL, causeRowCols); // 結果情報を持つ明細の部品のメソッド
	 * }
	 * <pre>
	 * 実装例２：
	 * </pre>
	 * &#064;Override
	 * protected void show() {
	 *	super.show();
	 *	// _checkedRslt1L 登録対象となった結果情報を表示するリスト
	 *	MCMessageList msgL = getParamMessage();
	 *	String[] downCols = {Rslt1R.#xxx, ...};
	 *	String[] causeRowCols = {Rslt2R.#yyy, ...};
	 *	Rslt1_rts_msg_p_PPanel.setMsgByKeyCols(_checkedRslt1L, downCols, msgL, causeRowCols); // 結果情報を持つ明細の部品のメソッド
	 * }
	 * </pre>
	 */
	public <E extends MCRow> void setMsgByKeyCols(MCList<E> downL, String[] downCols, MCMessageList msgL, String[] causeRowCols) {
		if (msgL == null || msgL.isEmpty() || isNull(downL)) {
			return ;
		}
		
		String msgIdCol = columnRtnMsg_msg_id.getBaseRowColumnName();
		for (MCRow r : downL) {
			// 既にメッセージが設定されていたらスキップ
			if (!isNull(r.getString(msgIdCol))) {
				continue ;
			}
			
			// メッセージを設定する
			for (MCMessage msg : msgL) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}
				
				boolean matchedFlg = true;
				boolean notNullFlg = false;
				for (int i=0; i<downCols.length; i++) {
					Comparable<?> d = r.getValueNE(downCols[i]);
					Comparable<?> m = causeRow.getValueNE(causeRowCols[i]);
					if (!isSame(d, m)) {
						matchedFlg = false;
						break;
					}
					if (!isNull(d)) {
						notNullFlg = true;
					}
				}
				
				if (matchedFlg && notNullFlg) {
					r.setString(msgIdCol, msg.getID());
					r.setString(columnRtnMsg_msg.getBaseRowColumnName(), msg.toString());
					break;
				}
			}
		}
	}
	
	/**
	 * 選択カラムをオフにする。<br>
	 */
	protected void setChkOff(FXBAP_Caller caller, int blockIdx, MCList<?> downL) {
		MCRootPanel panel = getBaseRootPanel();
		if (panel instanceof IfListRegPanel) {
			IfListRegPanel p = (IfListRegPanel) panel;
			caller.addDownItemNames(blockIdx, p.getCheckColumn());
			for (MCRow r : downL) {
				if (r.getGUIIndex() < 0) {
					continue;
				}
				String rtn_sts_typ = r.getString(columnRtnMsg_rtn_sts_typ.getBaseRowColumnName());
				if (MAC_RTN_STS_TYP.isOK(rtn_sts_typ) || MAC_RTN_STS_TYP.isWRN(rtn_sts_typ)) {
					r.setBoolean(p.getCheckColumn(), false);
				}
				else {
					// 電文上はチェックは下ってこないので、trueの状態も設定する必要がある
					r.setBoolean(p.getCheckColumn(), true);
				}
			}
		}
	}

}