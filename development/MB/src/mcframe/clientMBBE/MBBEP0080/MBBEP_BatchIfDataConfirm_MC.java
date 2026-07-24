package mcframe.clientMBBE.MBBEP0080;

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

import mcframe.clientFXBA.FXBAP0140.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.File;
import java.util.Arrays;
import mcframe.commonCore.resource.ctrl.MCResource;
import mcframe.clientCore.container.io.MCCsvReader;
import mcframe.clientCore.container.io.MCContainerIOConfig;
import mcframe.commonCore.container.io.MCContainerIOConfig.Delimiter;
import mcframe.commonCore.container.io.MCContainerIOConfig.Encode;
import mcframe.clientCore.container.io.MCExcelReader;
import mcframe.clientCore.resource.MCConst;
import mcframe.clientCore.beans.MCBeansFileIO;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import mcframe.commonCore.resource.ctrl.MCReadableResource;
import mcframe.commonCore.meta.MCMeta;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static mcframe.commonFS.notice.FS_Msg_FW_A.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MBBEP_BatchIfDataConfirm"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MBBEP_BatchIfDataConfirm_MC extends MBBEP_BatchIfDataConfirm_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _resGotFlg = false;
	
	/**
	 * 検索済みのメッセージをキャッシュするマップです。
	 */
	protected Map<String, List<MsgLstR>>  _viewMsgCache = new HashMap<>();

	/**
	 * メッセージの表示順です。
	 * パーソナライズのソート順を設定していないときに有効です。
	 */
	protected MCRowComparator<MsgLstR> _logcp = MCList.SortType.ASC.getComparator(MsgLstR.$batch_log_no, MsgLstR.$seq);

	/**
	 * メッセージのまとまりを表すポリシーです。
	 */
	protected MCGroupByPolicy _logpolicy = new MCGroupByPolicy(BATCH_COLS);
	
	/**
	 * メッセージ検索対象のIFデータ件数です。
	 * 行選択変更後、選択行のメッセージを検索済みでない場合、選択行から、行選択移動方向に本設定件数を検索対象とします。
	 */
	protected int _cndSize = getPgmSettingNumberNE(this, MCNumber.valueOf(100), "srch" ,"msglist", "size").intValue();

	protected boolean _insFlg = false;
	protected boolean _delFlg = false;

	protected boolean _updFlg = false;

	protected boolean _chkColFlg = false;

	protected boolean _refFlg = false;

	protected boolean _condSortFlg = false;

	protected boolean _open_if_proc_typ_Flg = false;
	protected boolean _impFlg = false;
	protected String _ifProcTyp = null;
	protected String[] _impCols = null;
	protected String[] _chkByGrp = null;
	protected List<String> _impTransToColL = null;
	protected List<String> _impTransFrColL = null;
	protected String[] _colsInsEnable = null;

	protected String[] _colsInsRequired = null;

	protected String[] _colsInsReadonly = null;

	protected String[] _colsExcldCopy = null;

	protected List<String> _cndColL = null;

	protected List<String> _cndValL = null;

	protected List<String> _cndDtOffsetL = null;

	protected TransRes _transRes = null;

	protected List<String> _cndInitDtOffsetL = null;

	protected List<String> _cndInitValL = null;

	protected List<String> _cndInitTypL = null;

	protected List<String> _cndInitColL = null;

	protected List<String> _moveColL = null;

	protected List<String> _moveColPosL = null;

	protected List<String> _labelColL = null;

	protected List<String> _labelL = null;

	protected List<String> _labelMsgL = null;

	protected MCList<DefR> _defL = null;

	protected static final String TYP_STR = "C";

	protected static final String TYP_NUM = "N";

	protected static final String TYP_BOOLEAN = "F";

	protected static final String TYP_DATE = "D";

	protected static final String TYP_TIMESTAMP = "T";

	protected static final String CHECK = "Dtl.check";

	protected static final String IMP_FLG = "Dtl.imp_flg";

	protected static final String BATCH_LOG_NO = "batch_log_no";

	protected static final String BATCH_LOG_SUB_KEY1 = "log_sub_key1";

	protected static final String BATCH_LOG_SUB_KEY2 = "log_sub_key2";

	protected static final String[] BATCH_COLS = {
			BATCH_LOG_NO, BATCH_LOG_SUB_KEY1, BATCH_LOG_SUB_KEY2
	};

	private final double SP_RATIO = 0.7;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BatchIfDataConfirm_MC() {
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
	public MBBEP_BatchIfDataConfirm_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Btn]のボタン[imp_flg_select_all]の押下時の処理
	 */
	@Override
	public void doBtn_imp_flg_select_all(MCEventInfo info) {
		doSelectAll(Top_db_PPanel.DtlTable, Top_db_PPanel.DtlTable.getColumnConfig(IMP_FLG));
	}
	/**
	 * Panel[Btn]のボタン[imp_flg_deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_imp_flg_deselect_all(MCEventInfo info) {
		doDeselectAll(Top_db_PPanel.DtlTable, Top_db_PPanel.DtlTable.getColumnConfig(IMP_FLG));
	}
	/**
	 * Panel[Btn]のボタン[open_if_proc_typ]の押下時の処理
	 */
	@Override
	public void doBtn_open_if_proc_typ(MCEventInfo info) {
		MCRow row = Top_db_PPanel.DtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		openViewer();
	}
	/**
	 * [MB_MBBEL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0080_Upd01Caller<P extends MBBEP_BatchIfDataConfirm, B extends MB_MBBEL0080_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		// 通信対象のリスト（電文変換前）
		protected MCList<MCDTableRow> dtableL;

		protected MB_MBBEL0080_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setAsync(true);

			MCList<ContR> contL = getContL();
			contL.clear();

			dtableL = Top_db_PPanel.getSelected();
			for (int i = 0; i < dtableL.size(); i++) {
				MCDTableRow dtableR = dtableL.get(i);

				int guino = dtableR.getGUIIndex();
				for (String col : _impCols) {
					for (MCColumnConfig config : Top_db_PPanel.DtlTable.getColumnConfigs()) {
						MCMeta meta = config.getMeta();
						String id = meta.name();
						if (!isSame(id, col)
							|| meta.dbType() == null) {
							// 取込オペレーションに対する項目でない
							// DBの型を持たない > DBにない項目
							continue;
						}
	
						ContR contR = contL.createRow();
						contR.rowno(i);
						if (_impTransFrColL.contains(id)) {
							contR.id(_impTransToColL.get(_impTransFrColL.indexOf(id)));
						}
						else {
							contR.id(id);
						}
						contR.type(meta.type().toString());
						switch (meta.type()) {
							case STRING:
								contR.STRING(dtableR.getString(id));
								break;
							case NUMBER:
								contR.NUMBER(dtableR.getNumber(id));
								break;
							case BOOLEAN:
								contR.BOOLEAN(dtableR.getBoolean(id));
								break;
							case DATE:
								contR.DATE(dtableR.getDate(id));
								break;
							case TIMESTAMP:
								contR.TIMESTAMP(dtableR.getTimestamp(id));
								break;
							case BINARY:
								contR.BINARY(dtableR.getBinary(id));
								break;
							default:
								// InnerRowは対応しない
								break;
						}
						contR.setGUIIndex(guino);
						contR.setRefTime(dtableR.getRefTime());
						contL.add(contR);
					}
				}
			}

			MAC_IF_PROC_TYP typ = MAC_IF_PROC_TYP.get(_ifProcTyp);
			// リアルタイム取込と本画面のデータ取込では、実装するインタフェースの関係上、実行するオペレーションが異なる
			getInfoR().imp_ope(typ.imp_ope2());
			getInfoR().moduleid(Top_db_PPanel.getInfoR().moduleid());
			getInfoR().screenid(Top_db_PPanel.getInfoR().screenid());
			getInfoR().table(Top_db_PPanel.getInfoR().table());
			getInfoR().if_proc_typ(_ifProcTyp);
		}

		@Override
		protected void setMode() {
			super.setMode();

			setStatus(FIX);
		}
		@Override
		protected boolean isUpBlockStatusNone() {
			//return super.isUpBlockStatusNone();
			return false;
		}
	}
	
	/**
	 * Panel[Btn]のボタン[imp]の押下時の処理
	 */
	@Override
	public void doBtn_imp(MCEventInfo info) {
		callMB_MBBEL0080_Upd01();
	}
	/**
	 * [MB_MBBEL0080_Srch01]の定型処理のInnerClass
	 * 本検索オペレーションはログ検索処理であり、検索ボタン押下時に呼び出されるオペレーションではない。
	 * 行選択イベントで実行される。
	 */
	protected class MB_MBBEL0080_Srch01Caller<P extends MBBEP_BatchIfDataConfirm, B extends MB_MBBEL0080_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MB_MBBEL0080_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			setScreenAsync(false);
		}
		
		@Override
		protected void showNoDownDataMsg() {
			//ログが存在しない場合にMSGを表示させないよう空実装
		}

		@Override
		protected void handleMCEx(MCException ex) {
			Top_db_PPanel.getDtlL().clear();
			msgClear();
			super.handleMCEx(ex);
		}

		@Override
		protected void show() {
			super.show();
		}
	}
			
	protected Comparable<?>[]  getLogKey(MCRow r) {
		return new Comparable<?>[] {
			r.getStringNE(BATCH_LOG_NO), r.getNumberNE(BATCH_LOG_SUB_KEY1),
			r.getNumberNE(BATCH_LOG_SUB_KEY2)
		};
	}
	
	protected String getLogKeyStr(Comparable<?>[] vals) {
		return MCStringUtil.arrayValueJoin(Arrays.asList(vals).stream().map(s -> String.valueOf(s)).toArray(String[]::new));
	}
	
	protected void showSelectedRowMsg(MCEventInfo info) {
		MCDTableRow selectedRow = info.getEventIndex() < 0 ? null : Top_db_PPanel.getDtlL().get(info.getEventIndex());
		getMsgLstL().clear();

		if (isNull(selectedRow) || !hasBatchLogCols() || 
				isNull(selectedRow.getStringNE(BATCH_LOG_NO))) {
			MsgLstTable.doNC();
			MsgLstTable.adjustWidth();
			return;
		}

		String selectedKeyStr = getLogKeyStr(getLogKey(selectedRow));

		if (!_viewMsgCache.containsKey(selectedKeyStr)) {
			// 検索条件を設定
			setBatchLogNoToLogCond(info);

			if (!getLogCndL().isEmpty()) {
				callMB_MBBEL0080_Srch01();

				// 検索済みにする
				getLogCndL().forEach(cr -> {
					Comparable<?>[] cndKey = getLogKey(cr);
					_viewMsgCache.put(getLogKeyStr(cndKey),
							null);
				});

				MCIndexKey ik = getMsgLstL().createIndex(BATCH_COLS);
				
				// 検索結果をキャッシュする
				getMsgLstL().groupBy(_logpolicy).forEach(rr -> {
					Comparable<?>[] resultKey = getLogKey(rr);
					List<MsgLstR> msgs = getMsgLstL().subList(ik, resultKey);

					//デフォルトのソートはサーバの検索処理と合わせる
					msgs.sort(_logcp);
					_viewMsgCache.put(getLogKeyStr(resultKey),
							msgs);
				});
			}
		}

		getMsgLstL().setAll(_viewMsgCache.get(selectedKeyStr));
		
		// パーソナライズ設定のソート優先
		sort(MsgLstTable);
		
		MsgLstTable.selectRowNoFocus(0);
		MsgLstTable.doNC();
		MsgLstTable.adjustWidth();
	}

	/**
	 * Panel[Btn]のボタン[open_dtl_info]の押下時の処理
	 */
	@Override
	public void doBtn_open_dtl_info(MCEventInfo info) {
		MCRow row = Top_db_PPanel.DtlTable.getSelectedMCRow();
		if (isNull(row)) {
			dialog(msgNoSelectedRow());
			return;
		}
		openDtlInfo();
	}
	
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		if (Btn_open_dtl_info.getMode() == MCMode.ENABLE) {
			if (compo == Top_db_PPanel.DtlTable) {
				MCRow row = Top_db_PPanel.DtlTable.getSelectedMCRow();
				if (row == null) {
					dialog(msgNoSelectedRow());
					return;
				}
				openDtlInfo();
			}
		}
		if (Btn_open_if_proc_typ.getMode() == MCMode.ENABLE) {
			if (compo == Top_db_PPanel.DtlTable) {
				MCRow row = Top_db_PPanel.DtlTable.getSelectedMCRow();
				if (row == null) {
					dialog(msgNoSelectedRow());
					return;
				}
				openViewer();
			}
		}	
	}

	/**
	 * 詳細情報画面へ画面遷移
	 */
	protected void openDtlInfo() {
		MCDTableRow selectedRow = Top_db_PPanel.DtlTable.getSelectedMCRow();
		Map<String, String> transMap = _transRes.get(selectedRow);
	
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener(transMap.get("mid"), transMap.get("scrn"));
		aso.putCndBlockNm(transMap.get("cndBlk"));

		MCRow bindR = MCRow.create();
		List<String> clearL = new ArrayList<String>();
		for (int i=1;; i++) {
			String toColKey = "toCol" + i, frColKey = "frCol" + i;
			if (!transMap.containsKey(toColKey)) {
				break;
			}

			String toCol = transMap.get(toColKey);

			if (transMap.containsKey(frColKey) && !isNull(transMap.get(frColKey))) {
				MCDataType typ = selectedRow.getDataType(transMap.get(frColKey));
				Comparable<?> val = selectedRow.getValueNE(transMap.get(frColKey));
				if (typ != null) {
					bindR.addValueColumn(toCol, typ, val);
					if (isNull(val)
							|| isSame(typ, MCDataType.BOOLEAN) && !(boolean) val) {
						clearL.add(toCol);
					}
				}
			}
			else {
				String
					typ = transMap.get("typ" + i),
					val = transMap.get("val" + i),
					offset = transMap.get("dtOffset" + i);
				if (isSame(typ, TYP_STR)) {
					bindR.setStringNE(toCol, val);
				}
				else if (isSame(typ, TYP_NUM) && !isNull(val)) {
					bindR.setNumberNE(toCol, MCNumber.valueOf(val));
				}
				else if (isSame(typ, TYP_BOOLEAN)) {
					bindR.setBooleanNE(toCol, MCBooleanUtil.dbStringToBoolean(val));
				}
				else if (isSame(typ, TYP_DATE) && !isNull(val)) {
					bindR.setDateNE(toCol, convertDateForRes(val, offset));
				}
				if (isNull(val)) {
					if (isSame(typ, TYP_NUM)) {
						bindR.setNumberNE(toCol, null);
					}
					else if (isSame(typ, TYP_DATE)) {
						bindR.setDateNE(toCol, null);
					}
					clearL.add(toCol);
				}
				else if (isSame(typ, TYP_BOOLEAN) && !MCBooleanUtil.dbStringToBoolean(val)) {
					clearL.add(toCol);
				}
			}
		}

		aso.putCnd(bindR, clearL);
		aso.runValueInit();

		String b = transMap.get("do_srch");
		if (b != null && Boolean.parseBoolean(b)) {
			aso.putSearchAction();
		}

		aso.show();
	}
	private void openViewer() {
		MCDTableRow selectedRow = Top_db_PPanel.DtlTable.getSelectedMCRow();
		if (selectedRow == null) {
			return;
		}
		
		Map<String, String> transMap = _transRes.get(selectedRow);
		ViewerInfo info = getViewerInfo(selectedRow, transMap);

		if (info == null) {
			dialog(FSBGC0009);
			return;
		}

		String[] bind = {MAC_IF_PROC_TYP.upd_if_tbl(transMap.get("value"))};
		MCRow cnd = MCRow.create();
		cnd.setBooleanNE("_doSrch_flg", Boolean.parseBoolean(transMap.get("do_srch")));
		for (int i=1;; i++) {
			String toColKey = "toCol" + i, frColKey = "frCol" + i;
			if (!transMap.containsKey(toColKey)) {
				break;
			}

			String toCol = transMap.get(toColKey);

			if (transMap.containsKey(frColKey) && !isNull(transMap.get(frColKey))) {
				cnd.setValueNE(toCol, selectedRow.getValueNE(transMap.get(frColKey)));
			}
			else {
				String
					typ = transMap.get("typ" + i),
					val = transMap.get("val" + i),
					offset = transMap.get("dtOffset" + i);
				if (isSame(typ, TYP_STR)) {
					cnd.setStringNE(toCol, val);
				}
				else if (isSame(typ, TYP_NUM) && !isNull(val)) {
					cnd.setNumberNE(toCol, MCNumber.valueOf(val));
				}
				else if (isSame(typ, TYP_BOOLEAN)) {
					cnd.setBooleanNE(toCol, MCBooleanUtil.dbStringToBoolean(val));
				}
				else if (isSame(typ, TYP_DATE) && !isNull(val)) {
					cnd.setDateNE(toCol, convertDateForRes(val, offset));
				}
			}
		}
		openPanel(info.moduleId, info.screenId, T2, cnd,bind);
	}

	// データ参照制御が未指定ならkeyにnullを指定すること。MCConst#createKeyで無視してくれる。
	private ViewerInfo getViewerInfo(MCDTableRow r, Map<String, String> transMap) {
		String mod, scr;

		mod = transMap.get("mid");
		if (mod != null) {
			scr = transMap.get("scrn");
			return  new ViewerInfo(mod, scr);
		}
		return null;
	}

	private class ViewerInfo {
		public String moduleId;

		public String screenId;

		public ViewerInfo(String mod, String scr) {
			moduleId = mod;
			screenId = scr;
		}
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		if (_chkByGrp != null) {
			selectAllNotGui(true);
		}
		else {
			Top_db_PPanel.doSelectAll();
		}
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		if (_chkByGrp != null) {
			selectAllNotGui(false);
		}
		else {
			Top_db_PPanel.doDeselectAll();
		}
	}
	/**
	 * 全選択、全解除をGUI部品ではなくコンテナに対して行う
	 * 
	 * @param sel true：全選択、false；全解除
	 */
	protected void selectAllNotGui(boolean sel) {
		MCColumnConfig chkCol = Top_db_PPanel.DtlTable.getColumnConfig(CHECK);
		for (MCDTableRow row : Top_db_PPanel.DtlTable.getViewRows()) {
			if (isEditable(chkCol, row.getGUIIndex())) {
				String chknm = chkCol.getMeta().name();
				row.setBoolean(chknm, sel);
				
				if (!isSame(row.getStatus(), Status.DELETE) && !isSame(row.getStatus(), Status.CREATE)) {
					row.setStatus(Status.MODIFY);
				}
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		MCDTableRow newR = insertRow(Top_db_PPanel.DtlTable);

		if (newR != null) {
			newR.addBooleanColumn("add_flg", true);
			setDelBtnStatus(newR);
			getMsgLstL().clear();
			MsgDtl_msg.clear();
		}
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(Top_db_PPanel.DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		MCDTableRow newR = copyRow(Top_db_PPanel.DtlTable);

		if (newR != null) {
			clearCpyRowVals(newR);
			getMsgLstL().clear();
			MsgDtl_msg.clear();
		}
	}

	/**
	 * コピーした行項目値のクリア
	 */
	protected void clearCpyRowVals(MCDTableRow newR) {
		if (_colsExcldCopy == null) {
			return;
		}
		for (String col : _colsExcldCopy) {
			if (newR.contains(col)) {
				newR.clear(col);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		//選択ＦＬＧがオンの行が1件でもあった場合、メッセージを出力して止める
		MCDTableList list = Top_db_PPanel.getDtlL();
		if(list.subList("check", true).size() !=0) {
			dialog(new MCMessage(MBBEP0009));
			return;
		}
		Top_db_PPanel.doUpdate();
	}

	/**
	 * Panel[Btn]のボタン[in_file]の押下時の処理
	 */
	@Override
	public void doBtn_in_file(MCEventInfo info) {
		try {
			MCBeansUtil.setMouseCursorWait();

			doFileInAction(Top_db_PPanel.DtlTable);
		}
		finally {
			MCBeansUtil.setMouseCursorDefault();
		}

	}

	@Override
	public void doMsgLst_NC(MCEventInfo info) {
		super.doMsgLst_NC(info);
		MsgLstR lstR = MsgLstTable.getSelectedMCRow();
		if (lstR != null) {
			getMsgDtlR().msg(lstR.msg_txt());
		}
		else {
			getMsgDtlR().msg(null);
		}
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Top_db_PPanel.DtlTable) doTop_db_PPanel_DtlTable_NC(info);
		else if (nc == Top_db_PPanel.DtlTable.getColumnConfig(CHECK))	doTop_db_PPanel_check_NC(info);
		else if (nc == Top_db_PPanel.DtlTable.getColumnConfig(IMP_FLG))	doTop_db_PPanel_imp_flg_NC(info);
	}

	public void doTop_db_PPanel_DtlTable_NC(MCEventInfo info) {
		MCRow row = Top_db_PPanel.DtlTable.getSelectedMCRow();
		setDelBtnStatus(row);
		setCopyBtnStatus(row);
		setOpenDtlBtnStatus(row);
		showSelectedRowMsg(info);
	}

	public void doTop_db_PPanel_check_NC(MCEventInfo info) {
		int index = info.getEventIndex();
		MCRow row = Top_db_PPanel.DtlTable.getRow(index);

		if (isNull(row) || _chkByGrp == null) {
			return;
		}
		else {
			for (String s : _chkByGrp) {
				if (!row.contains(s))	return;
			}
		}

		// グループが同じものを抽出
		MCList<MCDTableRow> subL = Top_db_PPanel.getDtlL().subList(_chkByGrp, row);

		for (MCRow subR : subL) {
			// ＰＧ実行状況区分が取込済、スキップ、処理対象外の場合、変更不可
			// 検索結果、または新規行のみグルーピングし変更する
			MCColumnConfig config = Top_db_PPanel.DtlTable.getColumnConfig(CHECK);
			if (config == null
					|| !isEditable(config, subR.getGUIIndex())
					|| (isNull(subR.getNumberNE("data_no")) && isSame(subR.getStatus(), Status.NONE))) {
				continue;
			}

			String chknm = config.getMeta().name();
			if (row.getBooleanNE(chknm)) {
				//subR.setBoolean(DtlR.$imp_flg, true);
				subR.setBoolean(chknm, true);
			}
			else {
				subR.setBoolean(chknm, false);
			}

			if (!isSame(subR.getStatus(), Status.DELETE) && !isSame(subR.getStatus(), Status.CREATE)) {
				subR.setStatus(Status.MODIFY);
			}
		}
	}

	public void doTop_db_PPanel_imp_flg_NC(MCEventInfo info) {
		MCRow row = Top_db_PPanel.DtlTable.getRow(info.getEventIndex());
		if (!row.getBooleanNE("imp_flg") && row.getBooleanNE("check")) {
			setValueEx(Top_db_PPanel.DtlTable.getColumnConfig(CHECK), info.getEventIndex(), false);
		}
	}
	/**
	 * 選択行に応じて行削除ボタンのステータスを変更する。
	 * @param row 選択行
	 * */
	protected void setDelBtnStatus(MCRow row) {
		if (UPD.equals(getStatus()) && _insFlg && !isNull(row)
				&& (row.isStatusCreate() || row.getBooleanNE("add_flg")
						|| (_delFlg 
								&& !MAC_EXE_STS_TYP.isOK(row.getStringNE("exe_sts_typ"))
								&& !MAC_EXE_STS_TYP.isSKP(row.getStringNE("exe_sts_typ"))
								&& !(MAC_EXE_STS_TYP.isNOT_EXE(row.getStringNE("exe_sts_typ"))
										&& MAC_SDRV_STS_TYP.isRECV_CONV_ERR(row.getStringNE("sdrv_sts_typ")))))) {
			Btn_rdel.setMode(MCMode.ENABLE);
		}
		else {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
	}

	/**
	 * 選択行に応じて行コピーボタンのステータスを変更する。
	 * @param row 選択行
	 * */
	protected void setCopyBtnStatus(MCRow row) {
		if (UPD.equals(getStatus()) && _insFlg && !isNull(row)) {
			Btn_rcopy.setMode(MCMode.ENABLE);
		}
		else {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
	}

	protected void setOpenDtlBtnStatus(MCRow row) {
		if (!isNull(row) && _transRes.isEnabled(row)) {
			if(_open_if_proc_typ_Flg){
				Btn_open_dtl_info.setMode(MCMode.INVISIBLE);
				Btn_open_if_proc_typ.setMode(MCMode.ENABLE);
			}
			else{
				Btn_open_dtl_info.setMode(MCMode.ENABLE);
				Btn_open_if_proc_typ.setMode(MCMode.INVISIBLE);
			}
		}
		else {
			Btn_open_dtl_info.setMode(MCMode.DISABLE);
		}
	}

	@Override
	public void layoutInit() {
		super.layoutInit();
		TopPanel.removeAll();
		TopPanel.setLayout(new BorderLayout());
		TopPanel.add(Top_db_PPanel, BorderLayout.CENTER);
		enablePersonalizeLocation = false;
	}

	@Override
	public void initialized() {
		setSplitPaneLocation();
		super.initialized();
	}

	/**
	 * 一覧枠とメッセージ枠の間のスプリットペインの位置を調整する。
	 * 部品が検索条件を自動調整することにより、自動生成による調整がうまくいかないため。
	 * */
	protected void setSplitPaneLocation() {
		Container c = Top_db_PPanel.getParent();
		while (c != null) {
			if (c instanceof MCSplitPane) {
				MCSplitPane sp = (MCSplitPane) c;
				sp.setDividerLocation(SP_RATIO);
				break;
			}
			c = c.getParent();
		}
	}

	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		String table = null;

		//バッチログ確認から遷移する場合
		if (T1.equals(openTyp) && !isNull(bind)) {
			String keysub1 = "DATA_REF_CTL";
			String keysub2 = bind.getStringNE("data_ref_ctl");
			String keysub3 = null;
			if (isNull(keysub2)) {
				keysub1 = bind.getStringNE("module_id");
				keysub2 = bind.getStringNE("logic_id");
				keysub3 = bind.getStringNE("operation_id");
			}
			
			String key = MCConst.createKey(getModuleID(), getScreenID(), keysub1,
					keysub2, keysub3);
			table = MCConst.app.getString(key);
			bind.setBooleanNE("_not_init_flg",true);
			bind.setBooleanNE("_doSrch_flg",true);
		}

		//バッチログ確認以外から遷移する場合
		else if (T2.equals(openTyp)) {
			if (args != null && args.length > 0) {
				table = (String) args[0];
			}
			if (isNull(bind)) {
				bind = MCRow.create();
			}
			if (args != null && args.length > 1) {
				for (int i=1; i < args.length; i=i+2) {
					bind.addStringColumn((String)args[i], (String)args[i+1]);
				}
			}
		}

		if (isNull(table)) {
			throw new MCAppException(msgUnknownOpenParam());
		}
		else {
			if (isNull(bind)) {
				bind = MCRow.create();
			}
			tbleditInit(getModuleID(), getScreenID(), table, bind);
		}
		Top_db_PPanel.enablePersonalizeGroup();
		
		valueInit();
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		MsgLstTable.setStatusColumnVisible(false);
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Top_db_PPanel.layoutAfterOpen();
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		msgClear();
	}
	
	/**
	 * 汎用テーブル編集部品を初期化します。
	 *
	 * @param moduleid モジュールID（リソース定義している画面）
	 * @param screenid 画面ID（リソース定義している画面）
	 * @param table テーブル名
	 * @param cond 初期検索条件
	 */
	protected void tbleditInit(String moduleid, String screenid, String table, MCRow cond) {

		Top_db_PPanel.initTbledit(moduleid, screenid, table, cond);
		Top_db_PPanel.setUPDBaseStatus(UPD);
		Top_db_PPanel.setFIXBaseStatus(FIX);
		Top_db_PPanel.setTableRowSelector("check",
				MCConst.label.getLabel(MCConst.createKey(moduleid, screenid, CHECK, "label")));
		Top_db_PPanel.setCallAfterListener(new FXBAP0140CallAfterListener() {

			@Override
			public void resultSuccessDef() {
				getAppDefResInfo();
				setInfoForCellConf();
				sortDefL();

				// メインメニュー以外の画面から遷移した場合は、リソース指定の初期値を利用しないことがあるため。
				if (!cond.getBooleanNE("_not_init_flg")) {
					defaultInitCnd();
				}
			}

			@Override
			public void resultSuccessInit() {
				setDefaultColumnPosition();
				setTableLabel();
				setColumnPosition();
				setInfoForCellConf();
				addColumnListener();

				//メインメニュー以外の画面から遷移した場合は、即時検索することがある。
				if (cond.getBooleanNE("_doSrch_flg")) {
					Top_db_PPanel.doSrchAction();
				}
			}

			@Override
			public void resultSuccessSrch() {
				msgClear();
				Top_db_PPanel.DtlTable.doNC();
			}

			@Override
			public void resultNoDataFoundSrch() {
				msgClear();
			}

			@Override
			public void handleMCExSrch(MCException ex) {
				msgClear();
			}

			@Override
			public void resultSuccessUpd() {
			}

			@Override
			public void handleMCExUpd(MCException ex) {
				for (MCMessage m :ex.getCauseMessageList()) {
					String[] str = m.getBindArray();

					if (isBindEmpty(str)) continue;
					String causeCol = str[20];
					String causeVal = str[21];

					MCIndexKey idx = Top_db_PPanel.getDtlL().createIndex(causeCol);
					MCDataType type = Top_db_PPanel.getDtlL().getDataType(causeCol);
					MCDTableRow r = MCDTableRow.create();
					if (type == MCDataType.NUMBER) {
						r = Top_db_PPanel.getDtlL().getFirst(idx, MCNumber.valueOf(causeVal));
					} else if (type == MCDataType.STRING) {
						r = Top_db_PPanel.getDtlL().getFirst(idx, causeVal);
					}
					m.setCauseRow(r, causeCol);
				}
			}

		});
		Top_db_PPanel.DtlTable.addAllListener(this);
	}

	/**
	 * メッセージのバインド変数についてnullチェックを行う
	 * @param str
	 * @return
	 */
	protected boolean isBindEmpty(String[] str) {
		boolean flg = false;
		if (str.length < 22 || str[20].isEmpty() || str[21].isEmpty()) {
			flg = true;
		}
		return flg;
	}

	/**
	 * 汎用テーブルのカラムにイベントを追加する
	 */
	protected void addColumnListener() {
		for (String s : new String[]{CHECK, IMP_FLG}) {
			MCColumnConfig config = Top_db_PPanel.DtlTable.getColumnConfig(s);
			if (config != null) {
				config.addNCListener(this);
			}
		}
	}
	/**
	 * リソース情報の取得。クライアントで必要なリソースは全て本処理で取得される。
	 */
	protected void getAppDefResInfo() {

		FXBAP0140AppDefResource res = Top_db_PPanel.getAppDefResource();

		_updFlg = res.getBoolean("upd");
		_insFlg = res.getBoolean("ins");
		_delFlg = res.getBoolean("del");
		_chkColFlg = res.getBoolean("chkCol");
		_refFlg = res.getBoolean("ref");
		_colsInsEnable = res.getStringArray("cols.ins_enable");
		_colsInsRequired = res.getStringArray("cols.ins_required");
		_colsInsReadonly = res.getStringArray("cols.ins_readonly");
		_colsExcldCopy = res.getStringArray("cols.excld_copy");

		_transRes = new TransRes();

		_ifProcTyp = res.getString("ifProcTyp");
		_impCols = res.getStringArray("imp.cols");
		_open_if_proc_typ_Flg = res.getBoolean("open_if_proc_typ");
		_impFlg = !isNull(_ifProcTyp) && _impCols != null && _impCols.length > 0;
		_chkByGrp = res.getStringArray("chkByGrp");
		int k = 1;
		String impTransToCol = "";
		_impTransToColL = new ArrayList<String>();
		_impTransFrColL = new ArrayList<String>();
		do {
			impTransToCol = res.getString("imp.trans.toCol" + k);
			if (!isNull(impTransToCol)) {
				_impTransToColL.add(impTransToCol);
				_impTransFrColL.add(res.getString("imp.trans.frCol" + k));
			}
			k++;
		}
		while (!isNull(impTransToCol));

		int n = 1;
		_cndInitColL = new ArrayList<String>();
		_cndInitValL = new ArrayList<String>();
		_cndInitTypL = new ArrayList<String>();
		_cndInitDtOffsetL = new ArrayList<String>();
		String condInitCol = "";
		do {
			condInitCol = res.getString("cnd.init.col" + n);
			if (!isNull(condInitCol)) {
				_cndInitColL.add(condInitCol);
				_cndInitValL.add(res.getString("cnd.init.val" + n));
				_cndInitTypL.add(res.getString("cnd.init.typ" + n));
				_cndInitDtOffsetL.add(res.getString("cnd.init.dtOffset" + n));
			}
			n++;
		}
		while (!isNull(condInitCol));

		int m = 1;
		_moveColL = new ArrayList<String>();
		_moveColPosL = new ArrayList<String>();
		String moveCol = "";
		do {
			moveCol = res.getString("dtl.move.col" + m);
			if (!isNull(moveCol)) {
				_moveColL.add(moveCol);
				_moveColPosL.add(res.getString("dtl.move.pos" + m));
			}
			m++;
		}
		while (!isNull(moveCol));

		int j = 1;
		_labelColL = new ArrayList<String>();
		_labelL = new ArrayList<String>();
		_labelMsgL = new ArrayList<String>();
		String labelCol = "";
		do {
			labelCol = res.getString("dtl.label.col" + j);
			if (!isNull(labelCol)) {
				_labelColL.add(labelCol);
				String labelLbl = MCConst.label.getLabel(MCConst.createKey(getScreenID(), Top_db_PPanel.getTableName(), "app.dtl.label.lbl" + j));
				if (isNull(labelLbl)) {
					labelLbl = res.getString("dtl.label.lbl" + j);
				}
				_labelL.add(labelLbl);
				String labelMsg = MCConst.label.getLabel(MCConst.createKey(getScreenID(), Top_db_PPanel.getTableName(), "app.dtl.label.msg" + j));
				if (isNull(labelMsg)) {
					labelMsg = res.getString("dtl.label.msg" + j);
				}
				_labelMsgL.add(labelMsg);
			}
			j++;
		}
		while (!isNull(labelCol));


		_resGotFlg = true;
	}

	/**
	 * メッセージ関係のオブジェクトをクリア
	 * */
	protected void msgClear() {
		getLogCndL().clear();
		_viewMsgCache.clear();
		getMsgLstL().clear();
		MsgDtl_msg.clear();
	}

	/**
	 * バッチログＮＯカラムが存在するかどうか。
	 * 存在する場合はtrue
	 * */
	protected boolean hasBatchLogCols() {
		List<String> l = Arrays.asList(Top_db_PPanel.getDtlL().getColumnPathArray());
		List<String> cols = Arrays.asList(BATCH_COLS);
		return l.containsAll(cols);
	}

	/**
	 * 存在するバッチログＮＯを抽出し、検索用リストにセット
	 * */
	protected void setBatchLogNoToLogCond(MCEventInfo info) {
		getLogCndL().clear();
		int oldidx = info.getOldIndex();
		int eventidx = info.getEventIndex();

		int stidx = oldidx < eventidx ? eventidx : eventidx - _cndSize;
		int endidx = oldidx < eventidx ? eventidx + _cndSize : eventidx + 1;

		MCDTableList topDtl = Top_db_PPanel.getDtlL();
		stidx = stidx < 0 ? 0 : stidx;
		endidx = endidx >= topDtl.size() ? topDtl.size() : endidx;

		for (MCDTableRow r : topDtl.subList(stidx, endidx).distinctNE(BATCH_COLS)) {
			if (!isNull(r.getStringNE(BATCH_LOG_NO)) &&
					!_viewMsgCache.containsKey(getLogKeyStr(getLogKey(r)))) {
				LogCndR logCndR = LogCndR.create();
				logCndR.batch_log_no(r.getStringNE(BATCH_LOG_NO));
				logCndR.log_sub_key1(r.getNumberNE(BATCH_LOG_SUB_KEY1));
				logCndR.log_sub_key2(r.getNumberNE(BATCH_LOG_SUB_KEY2));
				getLogCndL().add(logCndR);
			}
		}
	}

	/**
	 * リソースに従い、検索条件の初期値を設定する。
	 * */
	protected void defaultInitCnd() {

		for (int i = 0; i < _cndInitColL.size(); i++) {
			if (isSame(_cndInitTypL.get(i), TYP_STR)) {
				Top_db_PPanel.getInitCondition().setStringNE(_cndInitColL.get(i),
						_cndInitValL.get(i));
			}
			else if (isSame(_cndInitTypL.get(i), TYP_NUM)) {
				Top_db_PPanel.getInitCondition().setNumberNE(_cndInitColL.get(i),
						MCNumber.valueOf(_cndInitValL.get(i)));
			}
			else if (isSame(_cndInitTypL.get(i), TYP_BOOLEAN)) {
				Top_db_PPanel.getInitCondition().setBooleanNE(_cndInitColL.get(i),
						MCBooleanUtil.dbStringToBoolean(_cndInitValL.get(i)));
			}
			else if (isSame(_cndInitTypL.get(i), TYP_DATE)) {
				Top_db_PPanel.getInitCondition().setDateNE(_cndInitColL.get(i),
						convertDateForRes(_cndInitValL.get(i), _cndInitDtOffsetL.get(i)));
			}
			else if (isSame(_cndInitTypL.get(i), TYP_TIMESTAMP)) {
				MCDate dt = convertDateForRes(_cndInitValL.get(i), _cndInitDtOffsetL.get(i));
				if (!isNull(dt)) {
					Top_db_PPanel.getInitCondition().setTimestampNE(_cndInitColL.get(i),
						dt.toMCTimestamp());
				}
			}
		}
	}

	/**
	 * カラム位置をリソースに従い変更する。外部参照項目の位置変更などに利用する。
	 * */
	protected void setColumnPosition() {
		for (int i = 0; i < _moveColL.size(); i++) {
			MCColumnConfig col = Top_db_PPanel.DtlTable.getColumnConfig("Dtl."
					+ _moveColL.get(i));
			int pos = MCNumber.valueOf(_moveColPosL.get(i)).intValue();
			if (col != null && !isNull(pos) && pos > 0) {
				Top_db_PPanel.DtlTable.moveColumn(col, pos);
			}
		}
	}

	/**
	 * テーブルラベルをリソースに従って修正する。
	 * */
	protected void setTableLabel() {
		int i = 0;
		for (String col : _labelColL) {
			MCColumnConfig cc = Top_db_PPanel.DtlTable.getColumnConfig("Dtl." + col);
			if (cc != null) {
				cc.setHeaderMessage(_labelMsgL.get(i));
				cc.setHeaderName(_labelL.get(i));
			}
			i++;
		}
		Top_db_PPanel.DtlTable.adjustWidth();
	}

	/**
	 * リソース情報をセルコンフィグクラスへ設定する。
	 */
	protected void setInfoForCellConf() {
		MCCellConfig cell = Top_db_PPanel.DtlTable.getCellConfig();
		if (cell != null && cell instanceof MBBEP_CellConfig) {
			((MBBEP_CellConfig)cell).setResInfo(_colsInsEnable, _colsInsRequired, _colsInsReadonly);
		}
	}

	/**
	 * 検索条件のカラム位置をリソースに従い変更するため、コンテナをソートする。
	 * */
	protected void sortDefL() {
		// 明細のカラム位置にも影響するためソート前を退避
		_defL=Top_db_PPanel.getDefL().clone();
		
		FXBAP0140AppDefResource res = Top_db_PPanel.getAppDefResource();
		int m = 1;
		Map<String, Integer> condColMap = new HashMap<>();
		String moveCol = "";
		do {
			moveCol = res.getString("cond.move.col" + m);
			if (!isNull(moveCol)) {
				condColMap.put(moveCol, res.getNumber("cond.move.pos" + m).intValue());
			}
			m++;
		}
		while (!isNull(moveCol));
		
		if (condColMap.isEmpty()) {
			return;
		}
		_condSortFlg = true;
		
		// Mapの値（pos）でソート
		condColMap = condColMap.entrySet().stream().sorted(
				Map.Entry.comparingByValue()).collect(Collectors.toMap(
						Map.Entry::getKey, Map.Entry::getValue, (k1, k2) -> k1, LinkedHashMap::new));
		
		MCList<DefR> defL = Top_db_PPanel.getDefL();
		MCList<DefR> sortDefL = MCList.create(DefR.class);
		MCIndexKey idx = defL.createIndex(DefR.$id);
		for (String nKey : condColMap.keySet()) {
			DefR defR = defL.getFirst(idx, nKey);
			sortDefL.add(defR);
		}
		defL.removeAll(sortDefL);
		// リソース未設定の項目はリソース設定項目の後ろにDB順に追加
		for (DefR defR : defL) {
			sortDefL.add(defR);
		}
		Top_db_PPanel.setDefL(sortDefL);
	}

	/**
	 * 明細のカラム位置をデフォルトに戻す。
	 * */
	protected void setDefaultColumnPosition() {
		if (!_condSortFlg) {
			return;
		}
		
		int pos = 1;
		for (DefR defR : _defL) {
			MCColumnConfig col = Top_db_PPanel.DtlTable.getColumnConfig("Dtl." + defR.id());
			if (col != null && !isNull(pos) && pos > 0) {
				Top_db_PPanel.DtlTable.moveColumn(col, pos);
			}
			pos++;
		}
	}

	protected MBBEP_CellConfig crtCellConfig() {
		return new MBBEP_CellConfig();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);

		setBtnStatus();
		setColsMode();
	}

	/**
	 * ボタンモードの設定
	 */
	protected void setBtnStatus() {
		if (!_resGotFlg) {
			return;
		}
		// 行コピー、行削除、詳細情報ボタンは選択行に対応した制御を行うため、ここではモード設定しない。
		if (UPD.equals(getStatus())) {
			if (_chkColFlg) {
				Btn_select_all.setMode(MCMode.ENABLE);
				Btn_deselect_all.setMode(MCMode.ENABLE);
			}
			if (_updFlg) {
				Btn_upd.setMode(MCMode.ENABLE);
				setSelectImpFlgBtnMode();
			}
			if (_insFlg) {
				Btn_radd.setMode(MCMode.ENABLE);
				Btn_in_file.setMode(MCMode.ENABLE);
			}
			if (_impFlg) {
				Btn_imp.setMode(MCMode.ENABLE);
			}
		}
		else if(FIX.equals(getStatus())) {
			if (_insFlg) {
				Btn_in_file.setMode(MCMode.READ_ONLY);
			}
			if (_impFlg) {
				Btn_imp.setMode(MCMode.READ_ONLY);
			}			
		}
	}

	protected void setSelectImpFlgBtnMode() {
		MCColumnConfig impFlgCol = Top_db_PPanel.DtlTable.getColumnConfig(IMP_FLG);
		if (impFlgCol != null) {
			Btn_imp_flg_select_all.setMode(MCMode.ENABLE);
			Btn_imp_flg_deselect_all.setMode(MCMode.ENABLE);
		}
	}

	@Override
	protected boolean isVisibleInBaseAllStatuses2(MCModeBeans conf) {
		// 全てのモードで「I」の場合、表示領域をなくす仕様なのでsetModeでINVISIBLE以外を指定しても表示されない
		// なので、本メソッドで表示領域をなくされないようにする
		if (conf == Btn_in_file || conf == Btn_imp) {
			return true;
		}
		return super.isVisibleInBaseAllStatuses2(conf);
	}
	/**
	 * カラムの表示・非表示の設定
	 * */
	protected void setColsMode() {
		setChkColMode();
		setAllColsByRefMode();
	}

	/**
	 * 選択カラムの表示・非表示の設定
	 * */
	protected void setChkColMode() {
		if (!_chkColFlg && Top_db_PPanel.DtlTable.getColumnConfig(CHECK) != null) {
			hideCols(new String[] {
				CHECK
			});
		}
	}

	/**
	 * 送信IFデータやバッチデータの確認時は、全てのカラムをROにする。
	 * */
	protected void setAllColsByRefMode() {
		if (_refFlg) {
			for (MCColumnConfig c : Top_db_PPanel.DtlTable.getColumnConfigs()) {
				if (c.isVisible()) {
					c.setMode(MCMode.READ_ONLY);
				}
			}
		}
	}

	/**
	 * 指定したカラムを非表示にする。
	 * */
	protected void hideCols(String[] cols) {
		for (String col : cols) {
			Top_db_PPanel.DtlTable.getColumnConfig(col).setMode(MCMode.INVISIBLE);
		}
	}

	/**
	 * リソース固定値日付の転換
	 */
	protected MCDate convertDateForRes(String strDt, String offSet) {
		MCDate dt = null;
		if (isSame(strDt, "TODAY")) {
			dt = getToday();
			if (!isNull(offSet)) {
				dt = dt.addDay(MCNumber.valueOf(offSet));
			}
		}

		return dt;
	}

	/**
	 * ファイル入力
	 */
	protected void doFileInAction(MCTable<?> table) {
		// ファイル選択
		MCRootPanel under = getUnderPanel();
		MCRootPanel panel = (under != null) ? under : this;
		File f = MCFileChooser.showLoadDialog(null, panel, MCFileChooser.XLS, MCFileChooser.XLSX, MCFileChooser.CSV);
		if (f == null) {
			return;
		}
		if (!f.exists()) {
			MCMessageBox.dialog(panel, new MCMessage(MAUDP0004, f));
			return;
		}
		msgClear();
		MsgLstTable.adjustWidth();
		if (f.getName().toUpperCase().endsWith(MCFileChooser.CSV)) {
			doCSVReadAction(table, panel, f);
		}
		else {
			doExcelReadAction(table, panel, f);
		}
	}
	
	/**
	 * ＣＳＶファイル取込
	 */
	protected void doCSVReadAction(MCTable<?> table, MCRootPanel panel, File f) {

		// ファイルの内容をコンテナに入力
		table.getList().clear();
		MCList list = table.getList().createInstance();
		MCCsvReader reader = new MCCsvReader(panel.getModuleID(), panel.getScreenID(), list, f, table);

		MCContainerIOConfig config = getIOConfig();

		MCMessageList msgList;
		if (config.isReaderNameOut()) {
			// ファイルに項目行がある場合はファイルにある項目名で取り込む
			msgList = reader.read(config);
		}
		else {
			// ファイルに項目行がない場合は表示されているカラム順で取り込む
			MCColumnConfig[] columns = table.getViewColumnConfigs();
			List<String> names = new ArrayList<>();
			for (MCColumnConfig column : columns) {
				String name = column.getBaseRowColumnName();
				if (!isNull(name)) {
					names.add(name);
				}
			}
			msgList = reader.read(config, names.toArray(new String[0]));
		}

		// ファイル入力後の処理
		doCustomFileInAction(table, list, msgList);
	}
	
	/**
	 * Ｅｘｃｅｌファイル取込
	 */
	protected void doExcelReadAction(MCTable<?> table, MCRootPanel panel, File f) {
		// ファイルの内容をコンテナに入力
		table.getList().clear();
		MCList list = table.getList().createInstance();
		MCExcelReader reader = new MCExcelReader(panel.getModuleID(), panel.getScreenID(), list, f, table);

		MCContainerIOConfig config = getIOConfig();

		MCMessageList msgList;
		if (config.isReaderNameOut()) {
			// ファイルに項目行がある場合はファイルにある項目名で取り込む
			msgList = reader.read(config);
		}
		else {
			// ファイルに項目行がない場合は表示されているカラム順で取り込む
			MCColumnConfig[] columns = table.getViewColumnConfigs();
			List<String> names = new ArrayList<>();
			for (MCColumnConfig column : columns) {
				String name = column.getBaseRowColumnName();
				if (!isNull(name)) {
					names.add(name);
				}
			}
			msgList = reader.read(config, names.toArray(new String[0]));
		}

		// ファイル入力後の処理
		doCustomFileInAction(table, list, msgList);
	}

	/**
	 * ファイル入力後の処理
	 */
	@Override
	protected void doCustomFileInAction(MCTable<?> table, MCList list, MCMessageList msgList) {
		callOpeForCustom(list,msgList);
		
		super.doCustomFileInAction(table, list, msgList);
		// 本画面では項目を変更しても選択をオンにしないので、ファイル入力でもオンにしない。
		MCColumnConfig config = Top_db_PPanel.DtlTable.getColumnConfig(CHECK);
		if (config != null) {
			list.setBooleanNE("check", false);
		}
		config = Top_db_PPanel.DtlTable.getColumnConfig("Dtl." + BATCH_LOG_NO);
		if (config != null) {
			list.setStringNE(BATCH_LOG_NO, null);
		}
		config = Top_db_PPanel.DtlTable.getColumnConfig("Dtl." + BATCH_LOG_SUB_KEY1);
		if (config != null) {
			list.setNumberNE(BATCH_LOG_SUB_KEY1, null);
		}
		config = Top_db_PPanel.DtlTable.getColumnConfig("Dtl." + BATCH_LOG_SUB_KEY2);
		if (config != null) {
			list.setNumberNE(BATCH_LOG_SUB_KEY2, null);
		}
	}

	/**
	 * カスタマイズ用メソッド
	 * チェック処理やサロゲートキーの発番に利用する
	 * */
	protected void callOpeForCustom(MCList list, MCMessageList msgList){

	}
	
	/**
	 * ファイル入ＣＯＮＦＩＧを取得する。
	 */
	protected MCContainerIOConfig getIOConfig() {
		MCContainerIOConfig config = new MCContainerIOConfig(this.getModuleID(),
				this.getScreenID());
		config.setReaderEncode(Encode.getEncode(getFileEncode(), config.getReaderEncode()));
		config.setReaderDelimiter(Delimiter.getDelimiter(getFileDelimiter(),
				config.getReaderDelimiter()));
		config.setReaderNameOut(isUsedNameLine());
		config.setReaderTitleOut(isUsedTitleLine());
		
		return config;
	}
	/**
	 * trans から始まるリソースを扱うクラス
	 */
	public class TransRes {
		protected Map<String, Map<String, Map<String, String>>> _transMap;
		protected FXBAP0140AppDefResource _res;

		protected final String[] _$fixTags = {"key", "value", "mid", "scrn", "cndBlk", "do_srch"};
		protected final String[] _$varTags  = {"toCol", "frCol", "typ", "val", "dtOffset"};

		public TransRes() {
			_transMap = new LinkedHashMap<>();
			_res = Top_db_PPanel.getAppDefResource();
			read();
		}

		/**
		 * リソースの読み出し
		 */
		protected void read() {
			// ptn
			for (int i=1;; i++) {
				String ptn = "ptn" + i;
				String ptnPath = "trans." + ptn;

				if (isNull(_res.getString(ptnPath + "." + _$fixTags[0]))) {
					read(null, null);	// パタン指定なし(従来パタン)
					break;
				}
				// val
				for (int j=1;; j++) {
					String val = "value" + j;
					String valPath = ptnPath + "." + val;
					if (isNull(_res.getString(valPath + "." + _$fixTags[1]))) {
						read(ptn, null);	// パタンごとのデフォルト値
						break;
					}
					read(ptn, val);
				}
			}
		}
		protected void read(String ptn, String val) {

			String path = "trans";
			if (!isNull(ptn)) {
				path = path + "." + ptn;	// ptn1~ptnXX
			}
			if (!isNull(val)) {
				path = path + "." + val;	// value1~valueXX
			}

			Map<String, String> map = new LinkedHashMap<>();
			// 固定項目のリソースを取得
			for (String tag : _$fixTags) {
				map.put(tag, _res.getString(path + "." + tag));
			}
			// 可変項目のリソースを取得
			for (int j=1;; j++) {
				if (isNull(_res.getString(path + "." + _$varTags[0] + j))) {
					break;
				}
				for (String tag : _$varTags) {
					tag = tag + j;
					map.put(tag, _res.getString(path + "." + tag));
				}
			}

			Map<String, Map<String, String>> ptnMap= _transMap.get(ptn);
			if (ptnMap == null) {
				ptnMap = new LinkedHashMap<>();
				_transMap.put(ptn, ptnMap);
			}
			ptnMap.put(val, map);
		}

		/**
		 * 選択行に対応するリソースを取得する
		 */
		protected Map<String, String> get(MCRow r) {
			Map<String, String> rMap = new HashMap<>();

			for (String tag : _$fixTags) {
				rMap.put(tag, get(r, tag));
			}
			for (int i=1;; i++) {
				if (isNull(get(r, _$varTags[0] + i))) {
					// toColX がnullの場合は、そこで読み込み終わり
					break;
				}
				for (String tag : _$varTags) {
					tag = tag + i;
					rMap.put(tag, get(r, tag));
				}
			}
			return rMap;
		}
		protected String get(MCRow r, String tag) {
			String rValue = null;
			for (String ptn : _transMap.keySet()) {
				for (String val : _transMap.get(ptn).keySet()) {
					rValue = get(r, ptn, val, tag);
					if (!isNull(rValue)) {
						return rValue;
					}
				}
				rValue = get(r, ptn, null, tag);	// パタンごとにデフォルト値
				if (!isNull(rValue)) {
					return rValue;
				}
			}
			return get(r, null, null, tag);	// パタン指定なしのデフォルト値
		}
		protected String get(MCRow r, String ptn, String val, String tag) {
			if (_transMap.containsKey(ptn)) {
				Map<String, Map<String, String>> ptnMap = _transMap.get(ptn);
				if (ptnMap.containsKey(val)) {
					Map<String, String> valMap = ptnMap.get(val);
					if (valMap.containsKey(tag)) {
						if (isNull(val) || isMatch(r, ptnMap.get(null).get("key"), valMap)) {
							// val = null の時は選択行と比較する必要なし
							return valMap.get(tag);
						}
					}
				}
			}
			return null;
		}

		/**
		 * 選択された行と一致するリソースか判定する
		 */
		protected boolean isMatch(MCRow r, String key, Map<String, String> valMap) {
			String[]
				keyCols = getStringArray(key),
				keyVals = getStringArray(valMap.get("value"));
			if (keyVals.length != keyCols.length) {
				return false;
			}
			// 選択行に一致するvalueを探索
			for (int i=0; i<keyCols.length; i++) {

				boolean match = true;
				for (int j=0; j<keyCols.length; j++) {
					MCMeta meta = r.getMeta(keyCols[j]);
					if (meta == null) {
						continue;
					}
					else if (meta.type() == MCDataType.BOOLEAN) {
						boolean b = MCBooleanUtil.dbStringToBoolean(keyVals[j]);
						match = isSame(b, r.getBooleanNE(keyCols[j]));
					}
					else {
						match = isSame(keyVals[j], r.getStringNE(keyCols[j]));
					}
					if (!match) {
						break;
					}
				}
				if (match) {
					return true;
				}
			}
			return false;
		}
		public String[] getStringArray(String val) {
			String[] vals = MCStringUtil.split(MCReadableResource.ARRAY_ESCAPE,
												MCReadableResource.ARRAY_DELIMITER, val);
			for (int i = 0; i < vals.length; i++) {
				vals[i] = MCStringUtil.trim(vals[i]);
			}
			return vals;
		}
		protected boolean isEnabled(MCRow row) {
			Map<String, String> valMap = get(row);
			if (valMap == null
				|| isNull(valMap.get("mid"))
				|| isNull(valMap.get("scrn"))
				|| isNull(valMap.get("cndBlk"))) {
				return false;
			}
			return true;
		}
	}

	@Override
	public MCCaller<?, ?> getMiningCaller() {
		return null;
	}

}