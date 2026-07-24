package mcframe.clientMSBC.MSBCP0020;

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

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedList;

import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUC.MAUCP0110.MAUCP_UnitUtil;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowStatusEvent;

import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientMSUC.MSUCP0030.MSUCP_ProdListLogic;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MstrPlnReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MstrPlnReg_MC extends MSBCP_MstrPlnReg_MC_A implements IfListRegPanel, IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 最大の表示期間 */
	protected static int _MAX_DAY_DULATION = 93;
	/** 可変カラム列数 (QTY_00～QTY_93) */
	protected static int _RSLT_COL_NUM = 94;

	// Rsltテーブルのrow_title_colで使用するカラム名
	/** 日次依頼 */
	protected static String _RQMT_QTY = PlnR.$rqmt_qty;
	/** 先行手配 */
	protected static String _PRCD_RQMT_QTY = PlnR.$prcd_rqmt_qty;
	/** 出荷予定 */
	protected static String _SHIP_SCHD_QTY = PlnR.$ship_schd_qty;
	/** 生産可能 */
	protected static String _MPS_MAX_QTY = PlnR.$mps_max_qty;
	/** 合計 */
	protected static String _MPS_SUM_QTY = PlnR.$mps_sum_qty;
	/** 上部一覧行と下部一覧のマッピング */
	protected Map<MCNumber, MCList<ReqRsltR>> _reqRsltMap = new HashMap<MCNumber, MCList<ReqRsltR>>();
	/** 検索時点の納期Ｆｒｏｍ */
	protected MCDate _fromDt = null;
	/** 検索時点の納期Ｔｏ */
	protected MCDate _toDt = null;
	/** 可変カラム名と日付のMap */
	protected Map<String, MCDate> _colMap = null;
	/** 日付文字列と可変カラム番号のMap */
	protected Map<String, Integer> _dateMap = null;
	/** 可変カラムの配列 */
	protected MCColumnConfig[] _qtys = null;
	/** 可変カラムのカラム名配列 */
	protected String[] _qtyCols = null;
	/** 縦横変換処理のインスタンス */
	protected MAUCP_VHMapper<PlnR, RsltR> _vhM = new MAUCP_VHMapper<PlnR, RsltR>();
	/** 所要一覧行追加時の固定値項目 */
	protected ReqRsltR _reqR;
	protected boolean _prcdReq;
	/** 上部一覧リストのインデックス */
	protected MCIndexKey _rsltIdx = null;

	//--------- 所要日付一覧テーブルの表示行操作用 ここから ----------//
	/** テーブル表示用の元データは、キャッシュとして保持する */
	protected MCList<RsltR> _cacheRsltViewL = MCList.create(RsltR.class);
	/** テーブル表示行チェックボックス切替用 */
	protected LinkedList<String[]> _dispList = new LinkedList<String[]>();
	/** 画面表示切替<br>全表示用 */
	protected String[] _strDispAll = {_RQMT_QTY, _PRCD_RQMT_QTY, _SHIP_SCHD_QTY};
	/** 画面表示切替<br>chng0:基本表示用 */
	protected String[] _strDispChng0 = {_RQMT_QTY};
	/** 画面表示切替<br>chng1:出荷予定数量表示時追加項目 */
	protected String[] _strDispChng1 = {_SHIP_SCHD_QTY};
	/** 画面表示切替<br>chng2:先行手配表示時追加項目 */
	protected String[] _strDispChng2 = {_PRCD_RQMT_QTY};
	/** 表示切替ＦＬＧのカラム名 **/
	protected String[] _strCtrlFlgStr = {CndR.$disp_ship_schd_flg, CndR.$disp_prcd_flg};
	/** 画面表示切替<br>グループの最終行にNull行を追加するかどうか */
	protected boolean _addNullRowAtEnd = false;
	//--------- 所要日付一覧テーブルの表示行操作用 ここまで ----------//

	/** グルーピングのセルの色 */
	protected Color _grp_hdr_color = getPgmSettingColorNE(this, new Color(255,255,255), "color.grp_hdr");
	/** MPS合計数のセルの色 */
	protected Color _mps_sum_color = getPgmSettingColorNE(this, new Color(224,255,255), "color.mps_sum");
	/** MPS最大数のセルの色 */
	protected Color _mps_max_color = getPgmSettingColorNE(this, new Color(255,250,205), "color.mps_max");
	/** MPS合計数が最大数超過している場合の色 */
	protected Color _mps_exc_color = getPgmSettingColorNE(this, new Color(255,0,0), "color.mps_exc");
	/** 土曜日の色 */
	protected Color _sat_color = getPgmSettingColorNE(this, new Color(176,196,222), "color.sat");
	/** 日曜日の色 */
	protected Color _sun_color = getPgmSettingColorNE(this, new Color(255,192,203), "color.sun");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MstrPlnReg_MC() {
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
	public MSBCP_MstrPlnReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Srch01Caller<P extends MSBCP_MstrPlnReg, B extends MS_MSBCL0020_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0020_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRsltL());
		}

		@Override
		public boolean isDownBlockChanged() {
			if (isChanged()) {
				return true;
			}

			return super.isDownBlockChanged();
		}

		@Override
		protected void clear() {
			super.clear();

			// 可変カラムのラベル名とメッセージ用名称をクリアする
			_vhM.clearElmColsLabel();
			// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
			_vhM.clearCachedList();

			// テーブルヘッダ(日付ラベル)をクリア
			clearTblHdr();
			// 日付ラベルのマップをクリア
			if (_colMap != null) {
				_colMap.clear();
			}
			clearTblDtl();
			clearHiddenList();

			_cacheRsltViewL.clear();
			_reqR = null;
		}

		@Override
		protected void show() {
			super.show();
			setRslt();
		}

		@Override
		protected void setMode() {
			super.setMode();

			setTblHdr();
			setUpdStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			clearTblHdr();
			setSrchStatus();

			// 可変カラムのラベル名とメッセージ用名称をクリアする	
			_vhM.clearElmColsLabel();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			// 期間Ｆｒｏｍ <= 期間Ｔｏであること
			msgList.addAll(checkBeforeAfter(Cnd_due_dt_fr, Cnd_due_dt_to));
			// 検索する期間が範囲内であること
			MCDate endDt = getCndR().due_dt_to();
			MCDate stDt = getCndR().due_dt_fr();
			if (!isNull(stDt) && !isNull(endDt)
					&& (endDt.diffDay(stDt) >= _MAX_DAY_DULATION)) {
				MCMessage msg = new MCMessage(getCndR(), CndR.$due_dt_fr, MSUCP0001);
				msgList.add(msg);
			}
		}
	}

	/**
	 * [MS_MSBCL0020_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Sprt01Caller<P extends MSBCP_MstrPlnReg, B extends MS_MSBCL0020_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MCList<ReqRsltR> _rsltForSprtCall;

		protected MS_MSBCL0020_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP0001);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			_rsltForSprtCall = getReqRsltL().subList(ReqRsltR.$sno_sprt_flg, true);
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_rsltForSprtCall);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			//何もしない
		}
	}

	/**
	 * [MS_MSBCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Upd01Caller<P extends MSBCP_MstrPlnReg, B extends MS_MSBCL0020_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0020_Upd01Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<RsltR> _rsltLForCall = MCList.create(RsltR.class);;
		protected MCList<ReqRsltR> _reqRsltLForCall = MCList.create(ReqRsltR.class);

		@Override
		protected void initCaller() {
			super.initCaller();
			_rsltLForCall = getRsltL().subList(RsltR.$check, true);
			for(RsltR r : _rsltLForCall){
				MCList<ReqRsltR> list = _reqRsltMap.get(r.peg_no()).subList(ReqRsltR.$check, true);
				if (!isNull(list)) {
					_reqRsltLForCall.addAll(list);
				}
			}

			// 非表示リストのブロックにGUIIndexを連番で設定
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_rsltLForCall);
			bridge.up1().setAll(_reqRsltLForCall);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_due_dt_fr, Cnd_due_dt_to));
			for (ReqRsltR r : _reqRsltLForCall){
				RsltR rsltR = getRsltRow(r);
				if (isNull(r.due_dt())){
					msgList.add(new MCMessage(r, null, FXUCC0047,
							rsltR.getGUIIndex() + 1, columnReqRslt_due_dt.getMessageByLocale()));
				};
				if (isNull(r.rqmt_qty())){
					msgList.add(new MCMessage(r, null, FXUCC0047,
							rsltR.getGUIIndex() + 1, columnReqRslt_rqmt_qty.getMessageByLocale()));
				}
				else if(r.rqmt_qty().lte(MCNumber.ZERO)){
					msgList.add(new MCMessage(r, null, FXUCC0028,
							rsltR.getGUIIndex() + 1, columnReqRslt_rqmt_qty.getMessageByLocale()));
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			setRtnMsg(_rsltLForCall, getMessages());
			setReqBtnMode();
		}

		@Override
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = super.getDownBlocks();
			// 下り電文のブロックを置き換え
			result.set(1, _reqRsltLForCall);
			return result;
		}

		protected RsltR getRsltRow(ReqRsltR reqRsltR) {
			return _rsltLForCall.getFirst(RsltR.$peg_no, reqRsltR.hdr_peg_no());
		}
	}

	/**
	 * [MS_MSBCL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Del01Caller<P extends MSBCP_MstrPlnReg, B extends MS_MSBCL0020_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0020_Del01Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<RsltR> _rsltLForCall;
		protected MCList<ReqRsltR> _reqRsltLForCall;

		@Override
		protected void initCaller() {
			super.initCaller();

			_rsltLForCall = MCList.create(RsltR.class);
			_reqRsltLForCall = MCList.create(ReqRsltR.class);

			_rsltLForCall.setAll(getRsltL().subList(RsltR.$check, true));
			for(RsltR r : _rsltLForCall){
				MCList<ReqRsltR> list = _reqRsltMap.get(r.peg_no()).subList(ReqRsltR.$fix_flg, false);
				list.setBoolean(ReqRsltR.$check, true);
				_reqRsltLForCall.addAll(list);
			}

			// 非表示リストのブロックにGUIIndexを連番で設定
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up0().setAll(_rsltLForCall);
			bridge.up1().setAll(_reqRsltLForCall);
		}
		@Override
		protected void show() {
			super.show();
			setRtnMsg(_rsltLForCall, getMessages());
		}
	}
	protected void setRtnMsg(MCList<RsltR> rsltL, MCMessageList msgL) {
		String[] downCols = {RsltR.$peg_no};
		String[] causeRowCols = {ReqRsltR.$hdr_peg_no};
		Rslt_rts_msg_p_PPanel.setMsgByKeyCols(rsltL, downCols, msgL, causeRowCols);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL0020_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[sprt_sno]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_sno(MCEventInfo info) {
		callMS_MSBCL0020_Sprt01();
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(ReqRsltTable);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(ReqRsltTable);
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		ReqRsltR reqRsltR = insertRow(ReqRsltTable);
		RsltR rsltR = RsltTable.getSelectedMCRow();
		if(reqRsltR == null || rsltR == null){
			return;
		}
		// 上部一の選択行の情報を追加行へコピー
		addMapper(reqRsltR, _reqR);
		reqRsltR.check(true);
		reqRsltR.hdr_peg_no(rsltR.peg_no());
		_reqRsltMap.get(rsltR.peg_no()).add(reqRsltR);
		syncUpdSts(rsltR);
		ReqRsltTable.adjustWidth();
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		ReqRsltR delReqRsltR = deleteRow(ReqRsltTable);
		if (!isNull(delReqRsltR)) {
			// 下部一覧の削除行が一覧から削除された場合、マップからも削除
			if (isNull(delReqRsltR.rqmt_no())){
				_reqRsltMap.get(delReqRsltR.hdr_peg_no()).remove(delReqRsltR);
			}
			if (!isNull(delReqRsltR.due_dt()) && !isNull(delReqRsltR.rqmt_qty())) {
				resetRsltList();
				resetRsltListDate(delReqRsltR.due_dt());
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		ReqRsltR row = copyRow(ReqRsltTable);
		if (row == null || isViewEmpty(ReqRsltTable, row)) {
			return;
		}
		row.rqmt_no(null);
		row.sno_sprt_flg(false);
		row.old_due_dt(null);
		row.fix_flg(false);
		row.check(true);

		_reqRsltMap.get(row.hdr_peg_no()).add(row);

		resetRsltList();
		syncUpdSts(RsltTable.getSelectedMCRow());
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0020_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL0020_Del01();
	}

	/** 行追加時の初期値 */
	protected void addMapper(ReqRsltR copyR, ReqRsltR row) {

		copyR.itm_cd(row.itm_cd());
		copyR.itm_nm(row.itm_nm());
		copyR.itm_sub1(row.itm_sub1());
		copyR.itm_sub2(row.itm_sub2());
		copyR.itm_sub3(row.itm_sub3());
		copyR.strg_loc_cd(row.strg_loc_cd());
		copyR.strg_loc_nm(row.strg_loc_nm());
		copyR.unit_cd(row.unit_cd());
		copyR.unit_nm(row.unit_nm());
		copyR.dec_place(row.dec_place());
		copyR.mfg_loc_cd(row.mfg_loc_cd());
		copyR.mfg_loc_nm(row.mfg_loc_nm());
		copyR.sppl_cd(row.sppl_cd());
		copyR.sppl_nm(row.sppl_nm());
		copyR.rqst_loc_cd(row.rqst_loc_cd());
		copyR.rqst_loc_nm(row.rqst_loc_nm());
		copyR.sno1(MAC_STR.NULL_VAL.value());
		copyR.sno2(MAC_STR.NULL_VAL.value());
		copyR.sno3(MAC_STR.NULL_VAL.value());
		copyR.sno4(MAC_STR.NULL_VAL.value());
		copyR.due_dt(row.due_dt());
		copyR.mps_grp_cd(row.mps_grp_cd());
		copyR.mps_grp_nm(row.mps_grp_nm());

		if (isPrcdReq()) {
			copyR.mrp_typ(MSC_MRP_TYP.PRCD.value());
		}
		else{
			copyR.mrp_typ(MSC_MRP_TYP.MRP.value());
		}
		copyR.site_cd(row.site_cd());
		copyR.site_nm(row.site_nm());
		copyR.wg_cd(row.wg_cd());
		copyR.wg_nm(row.wg_nm());
		copyR.sno1_mng_typ(row.sno1_mng_typ());
		copyR.sno2_mng_typ(row.sno2_mng_typ());
		copyR.sno3_mng_typ(row.sno3_mng_typ());
		copyR.sno4_mng_typ(row.sno4_mng_typ());
		copyR.sno1_num_typ(row.sno1_num_typ());
		copyR.sno2_num_typ(row.sno2_num_typ());
		copyR.sno3_num_typ(row.sno3_num_typ());
		copyR.sno4_num_typ(row.sno4_num_typ());
		copyR.rqmt_sno1_flg(row.rqmt_sno1_flg());
		copyR.rqmt_sno2_flg(row.rqmt_sno2_flg());
		copyR.rqmt_sno3_flg(row.rqmt_sno3_flg());
		copyR.rqmt_sno4_flg(row.rqmt_sno4_flg());
		copyR.rqmt_typ(row.rqmt_typ());
		copyR.rqmt_typ_nm(row.rqmt_typ_nm());
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getQtys() {
		if (_qtys == null) {
			_qtys = new MCColumnConfig[] {
					columnRslt_qty_00, columnRslt_qty_01, columnRslt_qty_02,
					columnRslt_qty_03, columnRslt_qty_04, columnRslt_qty_05,
					columnRslt_qty_06, columnRslt_qty_07, columnRslt_qty_08,
					columnRslt_qty_09, columnRslt_qty_10, columnRslt_qty_11,
					columnRslt_qty_12, columnRslt_qty_13, columnRslt_qty_14,
					columnRslt_qty_15, columnRslt_qty_16, columnRslt_qty_17,
					columnRslt_qty_18, columnRslt_qty_19, columnRslt_qty_20,
					columnRslt_qty_21, columnRslt_qty_22, columnRslt_qty_23,
					columnRslt_qty_24, columnRslt_qty_25, columnRslt_qty_26,
					columnRslt_qty_27, columnRslt_qty_28, columnRslt_qty_29,
					columnRslt_qty_30, columnRslt_qty_31, columnRslt_qty_32,
					columnRslt_qty_33, columnRslt_qty_34, columnRslt_qty_35,
					columnRslt_qty_36, columnRslt_qty_37, columnRslt_qty_38,
					columnRslt_qty_39, columnRslt_qty_40, columnRslt_qty_41,
					columnRslt_qty_42, columnRslt_qty_43, columnRslt_qty_44,
					columnRslt_qty_45, columnRslt_qty_46, columnRslt_qty_47,
					columnRslt_qty_48, columnRslt_qty_49, columnRslt_qty_50,
					columnRslt_qty_51, columnRslt_qty_52, columnRslt_qty_53,
					columnRslt_qty_54, columnRslt_qty_55, columnRslt_qty_56,
					columnRslt_qty_57, columnRslt_qty_58, columnRslt_qty_59,
					columnRslt_qty_60, columnRslt_qty_61, columnRslt_qty_62,
					columnRslt_qty_63, columnRslt_qty_64, columnRslt_qty_65,
					columnRslt_qty_66, columnRslt_qty_67, columnRslt_qty_68,
					columnRslt_qty_69, columnRslt_qty_70, columnRslt_qty_71,
					columnRslt_qty_72, columnRslt_qty_73, columnRslt_qty_74,
					columnRslt_qty_75, columnRslt_qty_76, columnRslt_qty_77,
					columnRslt_qty_78, columnRslt_qty_79, columnRslt_qty_80,
					columnRslt_qty_81, columnRslt_qty_82, columnRslt_qty_83,
					columnRslt_qty_84, columnRslt_qty_85, columnRslt_qty_86,
					columnRslt_qty_87, columnRslt_qty_88, columnRslt_qty_89,
					columnRslt_qty_90, columnRslt_qty_91, columnRslt_qty_92,
					columnRslt_qty_93
			};
		}
		return _qtys;
	}

	/** 項目名の配列を返します */
	protected String[] getColnm() {
		if (_qtyCols == null) {
			_qtyCols = new String[] {
					RsltR.$qty_00, RsltR.$qty_01, RsltR.$qty_02, RsltR.$qty_03,
					RsltR.$qty_04, RsltR.$qty_05, RsltR.$qty_06, RsltR.$qty_07,
					RsltR.$qty_08, RsltR.$qty_09, RsltR.$qty_10, RsltR.$qty_11,
					RsltR.$qty_12, RsltR.$qty_13, RsltR.$qty_14, RsltR.$qty_15,
					RsltR.$qty_16, RsltR.$qty_17, RsltR.$qty_18, RsltR.$qty_19,
					RsltR.$qty_20, RsltR.$qty_21, RsltR.$qty_22, RsltR.$qty_23,
					RsltR.$qty_24, RsltR.$qty_25, RsltR.$qty_26, RsltR.$qty_27,
					RsltR.$qty_28, RsltR.$qty_29, RsltR.$qty_30, RsltR.$qty_31,
					RsltR.$qty_32, RsltR.$qty_33, RsltR.$qty_34, RsltR.$qty_35,
					RsltR.$qty_36, RsltR.$qty_37, RsltR.$qty_38, RsltR.$qty_39,
					RsltR.$qty_40, RsltR.$qty_41, RsltR.$qty_42, RsltR.$qty_43,
					RsltR.$qty_44, RsltR.$qty_45, RsltR.$qty_46, RsltR.$qty_47,
					RsltR.$qty_48, RsltR.$qty_49, RsltR.$qty_50, RsltR.$qty_51,
					RsltR.$qty_52, RsltR.$qty_53, RsltR.$qty_54, RsltR.$qty_55,
					RsltR.$qty_56, RsltR.$qty_57, RsltR.$qty_58, RsltR.$qty_59,
					RsltR.$qty_60, RsltR.$qty_61, RsltR.$qty_62, RsltR.$qty_63,
					RsltR.$qty_64, RsltR.$qty_65, RsltR.$qty_66, RsltR.$qty_67,
					RsltR.$qty_68, RsltR.$qty_69, RsltR.$qty_70, RsltR.$qty_71,
					RsltR.$qty_72, RsltR.$qty_73, RsltR.$qty_74, RsltR.$qty_75,
					RsltR.$qty_76, RsltR.$qty_77, RsltR.$qty_78, RsltR.$qty_79,
					RsltR.$qty_80, RsltR.$qty_81, RsltR.$qty_82, RsltR.$qty_83,
					RsltR.$qty_84, RsltR.$qty_85, RsltR.$qty_86, RsltR.$qty_87,
					RsltR.$qty_88, RsltR.$qty_89, RsltR.$qty_90, RsltR.$qty_91,
					RsltR.$qty_92, RsltR.$qty_93
			};
		}
		return _qtyCols;
	}

	/** 上部一覧の日付セルの数量を設定およびMPS */
	protected void resetRsltListDate(MCDate date) {

		MCNumber sumReq = MCNumber.ZERO;
		MCNumber mpsSumReq = MCNumber.ZERO;
		int i = _dateMap.get(date.toString());
		MCList<ReqRsltR> reqL = MCList.create(ReqRsltR.class);
		MCList<ReqRsltR> mpsReqL = MCList.create(ReqRsltR.class);
		
		reqL.addAll(_reqRsltMap.get(_reqR.hdr_peg_no()).subList(ReqRsltR.$due_dt, date));

		if (!isPrcdReq()) {
			MCList<ReqRsltR> subL = MCList.create(ReqRsltR.class);
			subL = getAllReqRsltL().subList(ReqRsltR.$mrp_typ, MSC_MRP_TYP.MRP.value());
			MCIndexKey mpsReqKey = subL.createIndex(ReqRsltR.$mps_grp_cd, ReqRsltR.$due_dt);
			mpsReqL.addAll(subL.subList(mpsReqKey, _reqR.mps_grp_cd(), date));
		}
		for (ReqRsltR r : reqL) {
			if (r.isStatusDelete() || isNull(r.rqmt_qty())) {
				continue;
			}
			sumReq = sumReq.add(r.rqmt_qty());
		}
		for (ReqRsltR r : mpsReqL) {
			if (r.isStatusDelete() || isNull(r.rqmt_qty())) {
				continue;
			}
			mpsSumReq = mpsSumReq.add(r.rqmt_qty());
		}

		RsltR rsltR = getRsltL().getFirst(RsltR.$peg_no, _reqR.hdr_peg_no());
		
		if (!isNull(rsltR)) {
			rsltR.setNumber(getColnm()[i], sumReq);
		}
		if (!isPrcdReq()) {
			RsltR mpsRsltR = getRsltL().getFirst(new String[] {
					RsltR.$mps_grp_cd, RsltR.$row_title_col
			}, new Comparable[] {
					_reqR.mps_grp_cd(), _MPS_SUM_QTY
			});
			if (!isNull(mpsRsltR)) {
				mpsRsltR.setNumber(getColnm()[i], mpsSumReq);
			}
		}
	}

	/** 上部一覧に対応する日次依頼リストを取得する */
	protected MCList<ReqRsltR> getAllReqRsltL(){
		MCList<ReqRsltR> rtnL = MCList.create(ReqRsltR.class);
		for(RsltR r: getRsltL()) {
			rtnL.addAll(getChildReqRsltL(r));
		}
		return rtnL;
	}

	// ------------オープン時の処理実装------------

	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltConf());
		ReqRsltTable.setCellConfig(createReqRsltConf());
	}

	@Override
	protected void setupParts() {
		ReqRslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		ReqRslt_sno_wrk_no_p_PPanel.setRelateBeans(columnReqRslt_itm_cd, columnReqRslt_itm_sub1,
				columnReqRslt_itm_sub2, columnReqRslt_itm_sub3, columnReqRslt_sno1_mng_typ,
				columnReqRslt_sno2_mng_typ, columnReqRslt_sno3_mng_typ,
				columnReqRslt_sno4_mng_typ, columnReqRslt_sno1_num_typ,
				columnReqRslt_sno2_num_typ, columnReqRslt_sno3_num_typ,
				columnReqRslt_sno4_num_typ, columnReqRslt_rqmt_sno1_flg,
				columnReqRslt_rqmt_sno2_flg, columnReqRslt_rqmt_sno3_flg,
				columnReqRslt_rqmt_sno4_flg);
		ReqRslt_rqmt_qty_p_PPanel.setRelateBeans(columnReqRslt_unit_cd,	columnReqRslt_dec_place);
		Rslt_qty_00_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_01_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_02_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_03_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_04_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_05_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_06_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_07_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_08_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_09_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_10_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_11_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_12_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_13_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_14_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_15_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_16_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_17_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_18_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_19_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_20_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_21_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_22_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_23_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_24_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_25_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_26_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_27_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_28_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_29_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_30_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_31_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_32_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_33_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_34_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_35_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_36_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_37_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_38_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_39_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_40_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_41_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_42_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_43_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_44_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_45_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_46_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_47_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_48_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_49_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_50_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_51_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_52_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_53_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_54_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_55_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_56_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_57_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_58_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_59_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_60_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_61_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_62_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_63_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_64_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_65_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_66_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_67_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_68_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_69_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_70_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_71_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_72_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_73_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_74_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_75_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_76_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_77_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_78_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_79_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_80_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_81_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_82_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_83_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_84_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_85_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_86_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_87_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_88_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_89_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_90_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_91_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_92_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_93_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		for (MCColumnConfig c : getQtys()) {
			c.addNEListener(this);
		}
		columnReqRslt_rqmt_qty.addNCListener(this);
		setListListener(ReqRsltTable, createReqRsltListListener());
	}

	protected MAUDP_RowListener createReqRsltListListener() {
		return new ReqRsltListRowListener();
	}

	protected class ReqRsltListRowListener extends MAUDP_RowListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			super.statusChanged(event);
			//値を変更した詳細に紐付く明細にチェックをつける
			MCConstRow r = event.getSourceRow();
			if (r != null) {
				r.setValue(ReqRsltR.$check, true);
				ReqRsltR reqRsltR = (ReqRsltR)r;
				MCIndexKey idxKey = getRsltL().createIndex(RsltR.$peg_no);
				RsltR rsltR = getRsltL().getFirst(idxKey, reqRsltR.hdr_peg_no());
				rsltR.check(true);
				reqRsltR.check(true);
				syncUpdSts(rsltR);
			}
		}
	}

	@Override
	protected void listInit() {
		super.listInit();

		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, RsltTable, getPlnL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// 横テーブルの「row_title_col」「row_title_nm」を定義する。グループの下に空行を入れる場合は最後にnullを指定する。
		LinkedHashMap<String, String> rowTitleMap = new LinkedHashMap<>();
		rowTitleMap.put(_RQMT_QTY, getDispString(_RQMT_QTY));
		rowTitleMap.put(_PRCD_RQMT_QTY, getDispString(_PRCD_RQMT_QTY));
		rowTitleMap.put(_SHIP_SCHD_QTY, getDispString(_SHIP_SCHD_QTY));
		_vhM.setRowTitles(rowTitleMap);

		// チェックボックスの選択によって表示・非表示を切り替えるための情報
		// 縦リストの「HVAL」の項目。１番目の要素は全項目。２番目の要素は常に表示する項目。
		// ３番目以降の要素はチェックボックスの選択によって表示・非表示を切り替える項目。
		// グループの下に空行を入れる場合は空行も制御項目に追加する必要がある
		_dispList.add(0, _strDispAll);
		_dispList.add(1, _strDispChng0);
		_dispList.add(2, _strDispChng1);
		_dispList.add(3, _strDispChng2);

		// n番目のチェックボックスの選択によって、dispListのn + 2番目の要素の項目の表示・非表示を切り替える
		MCCheckBox[] checkBox = new MCCheckBox[] {
				Cnd_disp_ship_schd_flg, Cnd_disp_prcd_flg
		};
		// 縦横変換クラスに設定する
		_vhM.setDispInfo(checkBox, _dispList);

	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (getSnoTyp(this) == 0) {
			setComponentInvisibleAllStatus(Btn_sprt_sno);
		}
	}
	// ------------ステータス制御------------
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);

		CndPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setUPDStatus(true);

		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}

	protected void setUPDStatus(boolean doFocus) {
		super.setUPDStatus();
		if (doFocus) {
			RsltTable.selectLeftmostColumn(0);
		}
		setReqBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		CndPanel.focusFirstComponent();
		RsltTable.selectLeftmostColumn(0);
		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);
	}

	// ------------VC------------

	@Override
	public boolean doReqRslt_due_dt_VC(MCEventInfo info) {
		if (super.doReqRslt_due_dt_VC(info)) {
			MCDate dt = (MCDate) info.getNewValue();

			if (!isNull(dt) && dt.gte(_fromDt) && dt.lte(_toDt)) {
				return true;
			}
		}
		return false;
	}

	// ------------NE------------

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL(), getReqRsltL(), getPlnL(), getMpsMaxRsltL());

		clearCacheVH();
		clearTblHdr();
		clearHiddenList();
		setSrchStatus();
	}

	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();

		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();

		if (_colMap != null) {
			_colMap.clear();
		}

		_cacheRsltViewL.clear();
		_vhM.getCachedHAllL().clear();

	}

	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);

		getReqRsltL().clear();
		RsltR r = RsltTable.getSelectedMCRow();
		if (!isNull(r)) {
			showChildL(r);
			_reqR = reqMapper(r, info);
		}
		setReqBtnMode();
	}

	/**
	 * 選択された上部一覧に紐づく下部一覧のリストを表示する
	 */
	protected void showChildL(RsltR r) {
		_prcdReq = false;
		if (r == null || isNull(r.peg_no())) {
			return;
		}

		getReqRsltL().setAll(getChildReqRsltL(r));
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, ReqRsltR.$due_dt);
		ReqRsltTable.sort(sp);
		ReqRsltTable.adjustWidth();

		if(isSame(r.row_title_col(), _PRCD_RQMT_QTY)){
			_prcdReq = true;
		}
	}

	/** 上部一覧行に紐づく下部一覧のリストを取得する */
	protected MCList<ReqRsltR> getChildReqRsltL(RsltR parRsltR) {
		MCList<ReqRsltR> ans = MCList.create(ReqRsltR.class);
		if(!isNull(parRsltR) && !isNull(parRsltR.peg_no())) {
			ans.addAll(_reqRsltMap.get(parRsltR.peg_no()));
		}
		return ans;
	}

	/** 検索前のステータス設定 */
	protected void setSrchStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			FoldTab.focusActiveFirstComponent();

			RsltTable.setStatusColumnVisible(false);
			ReqRsltTable.setStatusColumnVisible(true);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
			RsltTable.setStatusColumnVisible(false);
			ReqRsltTable.setStatusColumnVisible(false);
		}
		else if(Cnd_ope_DEL.isSelected()){
			setDELStatus();
			RsltTable.setStatusColumnVisible(false);
			ReqRsltTable.setStatusColumnVisible(false);
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	/** 検索後のステータス設定 */
	protected void setUpdStatus() {
		if (Cnd_ope_UPD.isSelected()){
			setUPDStatus();
		}
		else if(Cnd_ope_DEL.isSelected()){
			setDELStatus();
		}
		else if(Cnd_ope_REF.isSelected()){
			setREFStatus();
		}

		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 行追加時の初期値用の設定 */
	protected ReqRsltR reqMapper(RsltR row, MCEventInfo info) {
		ReqRsltR reqR = ReqRsltR.create();
		reqR.hdr_peg_no(row.peg_no());
		reqR.itm_cd(row.itm_cd());
		reqR.itm_sub1(row.itm_sub1());
		reqR.itm_sub2(row.itm_sub2());
		reqR.itm_sub3(row.itm_sub3());
		reqR.itm_nm(row.itm_nm());
		reqR.strg_loc_cd(row.strg_loc_cd());
		reqR.strg_loc_nm(row.strg_loc_nm());
		reqR.unit_cd(row.unit_cd());
		reqR.unit_nm(row.unit_nm());
		reqR.dec_place(row.dec_place());
		reqR.mfg_loc_cd(row.mfg_loc_cd());
		reqR.mfg_loc_nm(row.mfg_loc_nm());
		reqR.sppl_cd(row.sppl_cd());
		reqR.sppl_nm(row.sppl_nm());
		reqR.rqst_loc_cd(row.rqst_loc_cd());
		reqR.rqst_loc_nm(row.rqst_loc_nm());
		reqR.sno1(MAC_STR.NULL_VAL.value());
		reqR.sno2(MAC_STR.NULL_VAL.value());
		reqR.sno3(MAC_STR.NULL_VAL.value());
		reqR.sno4(MAC_STR.NULL_VAL.value());
		reqR.mps_grp_cd(row.mps_grp_cd());
		reqR.mps_grp_nm(row.mps_grp_nm());
		reqR.site_cd(row.site_cd());
		reqR.site_nm(row.site_nm());
		reqR.wg_cd(row.wg_cd());
		reqR.wg_nm(row.wg_nm());
		reqR.sno1_mng_typ(row.sno1_mng_typ());
		reqR.sno2_mng_typ(row.sno2_mng_typ());
		reqR.sno3_mng_typ(row.sno3_mng_typ());
		reqR.sno4_mng_typ(row.sno4_mng_typ());
		reqR.sno1_num_typ(row.sno1_num_typ());
		reqR.sno2_num_typ(row.sno2_num_typ());
		reqR.sno3_num_typ(row.sno3_num_typ());
		reqR.sno4_num_typ(row.sno4_num_typ());
		reqR.rqmt_sno1_flg(row.rqmt_sno1_flg());
		reqR.rqmt_sno2_flg(row.rqmt_sno2_flg());
		reqR.rqmt_sno3_flg(row.rqmt_sno3_flg());
		reqR.rqmt_sno4_flg(row.rqmt_sno4_flg());

		MCDate dt = _colMap.get(info.getNewColumn().getBaseRowColumnName());
		if (!isNull(dt)) {
			reqR.due_dt(dt);
		}
		else {
			reqR.due_dt(_fromDt);
		}

		if (isPrcdReq()) {
			reqR.mrp_typ(MSC_MRP_TYP.PRCD.value());
		}
		else{
			reqR.mrp_typ(MSC_MRP_TYP.MRP.value());
		}
		setRqmtTyp(row, reqR);

		return reqR;
	}
	protected void setRqmtTyp(RsltR r, ReqRsltR reqRsltR) {
		MCRow ret = MSUCP_ProdListLogic.getRqmtTyp(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd(), this);
		reqRsltR.rqmt_typ(ret.getStringNE("rqmt_typ"));
		MAC_RQMT_TYP.putNameNE(reqRsltR, ReqRsltR.$rqmt_typ, ReqRsltR.$rqmt_typ_nm);
	}

	// ------------Notification Change------------

	/**
	 * 出荷予定数量表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_ship_schd_flg_NC(MCEventInfo info) {
		super.doCnd_disp_ship_schd_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * 先行手配数量表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_prcd_flg_NC(MCEventInfo info) {
		super.doCnd_disp_prcd_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * ＭＰＳ集計表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_mps_flg_NC(MCEventInfo info) {
		super.doCnd_disp_mps_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * 表示区分の状況で表示内容を切り替える
	 */
	protected void dispChng() {
		RsltR beforR = RsltTable.getSelectedMCRow();

		setDisp();
		setHiddenList(getRsltL(), getReqRsltL());
		setRsltFocus(beforR);

		RsltTable.adjustWidth();
		
	}

	/**
	 * 表示切替した際のテーブルフォーカスの設定
	 * @param beforeR 表示切替前に選択中のRow
	 */
	protected void setRsltFocus(RsltR beforeR) {
		// 本画面は元の選択Rowに関わらず最上位行を選択することにする（最初のセル）
		if (getRsltL().isEmpty()) {
			return;
		}
		RsltTable.selectLeftmostColumn(0);
	}

	@Override
	public void setFocus(MCMessage msg) {
		// 下部一覧でエラーが発生した場合は、上部一覧にフォーカスを飛ばす
		if (msg.getCauseRow() != null && msg.getCauseRow() instanceof ReqRsltR) {
			for (RsltR r : getRsltL()) {
				if (isSame(((ReqRsltR) msg.getCauseRow()).hdr_peg_no(), r.peg_no())) {
					RsltTable.selectLeftmostColumn(r.getGUIIndex());
					break;
				}
			}
		}
		super.setFocus(msg);
	}

	/**
	 * 所要一覧行選択のイベント
	 */
	@Override
	public void doReqRslt_NC(MCEventInfo info) {
		super.doReqRslt_NC(info);
		setReqBtnMode();
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == columnReqRslt_rqmt_qty) {
			doReqRslt_rqmt_qty_NC(info);
		}
	}

	@Override
	public void doReqRslt_due_dt_NC(MCEventInfo info) {
		super.doReqRslt_due_dt_NC(info);

		resetRsltList();
	}

	protected void doReqRslt_rqmt_qty_NC(MCEventInfo info) {
		resetRsltList();
	}

	/**
	 * 日付一覧の数量を所要一覧から再計算する
	 */
	protected void resetRsltList() {
		if (isNull(_reqR)) {
			return;
		}

		MCList<MCRow> dateL = MCList.create(MCRow.class);
		dateL.addDateColumn("dt");
		for (ReqRsltR r : getReqRsltL().groupBy(ReqRsltR.$due_dt)) {
			if (isNull(r.due_dt())) {
				continue;
			}
			MCRow row = MCRow.create();
			row.addDateColumn("dt", r.due_dt());
			dateL.add(row);
		}
		for (ReqRsltR r : getReqRsltL().groupBy(ReqRsltR.$old_due_dt)) {
			if (isNull(r.old_due_dt())) {
				continue;
			}
			MCRow existR = dateL.getFirst("dt", r.old_due_dt());
			if (isNull(existR)) {
				MCRow row = MCRow.create();
				row.addDateColumn("dt", r.old_due_dt());
				dateL.add(row);
			}
		}

		for (MCRow row : dateL) {
			resetRsltListDate(row.getDate("dt"));
		}

		for (ReqRsltR r : getReqRsltL()) {
			r.old_due_dt(r.due_dt());
		}
	}

	/**
	 * 所要操作テーブル用ボタンの制御
	 */
	protected void setReqBtnMode() {
		setReqUpdBtnMode();
	}

	protected void setReqUpdBtnMode() {
		ReqRsltR reqRsltR = ReqRsltTable.getSelectedMCRow();
		RsltR rsltR= RsltTable.getSelectedMCRow();

		if (reqRsltR == null || isNull(rsltR) || MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())) {
			Btn_deselect_all.setMode(MCMode.DISABLE);
			Btn_select_all.setMode(MCMode.DISABLE);
			Btn_rdel.setMode(MCMode.DISABLE);
			Btn_rcopy.setMode(MCMode.DISABLE);
			Btn_sprt_sno.setMode(MCMode.DISABLE);
			if (getRsltL().size() == 0
					|| MAC_RTN_STS_TYP.isOK(rsltR.rtn_sts_typ())
					|| (!isNull(rsltR) && isNull(rsltR.peg_no()))
					|| !isReqRowForAdd(rsltR)) {
				Btn_radd.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_radd);
			}
		}
		else {
			setDefaultMode(Btn_deselect_all);
			setDefaultMode(Btn_select_all);
			if (reqRsltR.fix_flg()) {
				Btn_rdel.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_rdel);
			}
			setDefaultMode(Btn_radd);
			setDefaultMode(Btn_rcopy);
			setDefaultMode(Btn_sprt_sno);
		}
	}

	protected boolean isReqRowForAdd(RsltR rsltR) {
		return isSame(rsltR.row_title_col(), _RQMT_QTY)
				|| isSame(rsltR.row_title_col(), _PRCD_RQMT_QTY);
	}
	// ------------その他共通処理------------
	/**
	 * テーブルヘッダ名を設定する
	 */
	protected void setTblHdr() {
		MCDate dt = getCndR().due_dt_fr();
		long cnt = getCndR().due_dt_to().diffDay(dt) + 1;

		for (MCColumnConfig col : getQtys()) {
			if (cnt > 0) {
				if (isSame(dt.getDayOfWeek(), MCDate.SAT)) {
					col.setHeaderBackground(_sat_color);
				}
				else if (isSame(dt.getDayOfWeek(), MCDate.SUN)) {
					col.setHeaderBackground(_sun_color);
				}
				else {
					col.setHeaderBackground(null);
				}
				String s = toMDString(dt) + "(" + MAC_DAY_WEEK_TYP.toDayWeekTyp(dt).name() + ")";
				col.setHeaderName(s);
				col.setMessageName(s);
				col.setMode(MCMode.READ_ONLY);
				dt = dt.addDay(1);
			}
			else {
				col.setMode(MCMode.INVISIBLE);
			}
			cnt--;
		}
	}

	/**
	 * テーブルヘッダ(日付ラベル)をクリアする
	 */
	protected void clearTblHdr() {
		for (MCColumnConfig col : getQtys()) {
			col.setHeaderName("");
			col.setHeaderBackground(null);
		}
	}

	protected void clearTblDtl() {
		ReqRsltTable.clear();
	}
	
	protected void clearHiddenList() {
		_reqRsltMap.clear();
	}

	/**
	 * 検索結果を明細にコピーする(PlnL → コピ → RsltL)
	 */
	protected void setRslt() {

		_colMap = createCol();

		MCList<MCRow> ymdList = MCList.create(MCRow.class);
		_fromDt = getCndR().due_dt_fr();
		_toDt = getCndR().due_dt_to();

		MCDate dt = _fromDt;
		long pt = _toDt.diffDay(dt) + 1;

		for (int i = 0; i < pt; i++) {
			MCRow ymdR = ymdList.createRow();
			MCDate tmpDate = dt.addDay(i);

			// 可変カラムを識別するための値を設定する
			ymdR.setDateNE(PlnR.$due_dt, tmpDate);
			// 可変カラムのラベル名を設定する	
			ymdR.setStringNE(MAUCP_VHMapper.ELM_LABEL, toY2MString(tmpDate));

			// 可変カラムのメッセージ用名称を設定する（未設定時はラベル名がメッセージ用名称となる）
			ymdR.setStringNE(MAUCP_VHMapper.ELM_MSG, toY2MString(tmpDate));

			ymdList.add(ymdR);
		}

		_vhM.initColInfo(ymdList);

		// 縦横変換処理を実行する			
		// 第一引数の縦リストのデータを縦横変換し、第二引数のリストに追加する
		_vhM.convertVH(getPlnL(), _vhM.getCachedHAllL());

		setRsltView(_cacheRsltViewL, _vhM.getCachedHAllL());

		// チェックボックスの選択によって横テーブルの表示行を制御し、「キー」項目の表示内容を切り替える
		// 横テーブルをソートする			
		_vhM.doTableDispChange();

		setDisp();
	}

	/**
	 * RsltL用のカラム(qty_??)を付とセットで
	 * 必要な分だけ動的に作成する
	 * 
	 * @return colMap(HashMap)
	 */
	protected Map<String, MCDate> createCol() {
		Map<String, MCDate> colMap = new HashMap<String, MCDate>();
		Map<String, Integer> dateMap = new HashMap<String, Integer>();

		_fromDt = getCndR().due_dt_fr();
		_toDt = getCndR().due_dt_to();

		MCDate dt = _fromDt;
		long pt = _toDt.diffDay(dt) + 1;

		for (int i = 0; i < pt; i++) {
			MCDate d = dt.addDay(i);

			colMap.put(getQtys()[i].getBaseRowColumnName(), d);
			dateMap.put(d.toString(), i);
		}

		_dateMap = dateMap;
		return colMap;
	}

	/**
	 * 情報をテーブルに表示する<br>
	 * フォーカスは考慮しない
	 */
	protected void setDisp() {
		MCList<RsltR> tmpL = MCList.create(RsltR.class);

		//上部一覧と下部一覧を紐付け、マップへセットする。
		setHiddenList(_cacheRsltViewL, getReqRsltL());

		// 画面表示切替
		String[] strDisp = getDispString(_dispList, getCndR(), _strCtrlFlgStr, _addNullRowAtEnd);
		DispMatcher<RsltR> dispMatcher = crtDispMatcher(strDisp);
		tmpL.setAll(_cacheRsltViewL.subList(dispMatcher));
		//
		getRsltL().setAll(addParmGrpRow(tmpL));
		_rsltIdx = getRsltL().createIndex(RsltR.$mps_grp_cd, RsltR.$row_title_col);
	}

	/**
	 * ＭＰＳ集計行を追加する
	 * @param rsltL
	 */
	protected MCList<RsltR> addParmGrpRow(MCList<RsltR> rsltL) {
		if ( isNull(rsltL) ) {
			return null;
		}
		rsltL.sort(RsltR.$mps_grp_cd, RsltR.$record_grp_id, RsltR.$record_id);
		if (!getCndR().disp_mps_flg()) {
			return rsltL;
		}

		MCList<RsltR> newRsltL = MCList.create(RsltR.class);
		RsltR tmpPramSumR = RsltR.create();

		for (RsltR row : rsltL) {
			if (!isSame(row.row_title_col(), _RQMT_QTY)) {
				newRsltL.add(row);
				continue;
			}
			if (isSame(tmpPramSumR.mps_grp_cd(), row.mps_grp_cd())) {
				sumRsltRow(tmpPramSumR, row);
			}
			else {
				if (!isNull(tmpPramSumR.mps_grp_cd())) {
					addParmMaxR(newRsltL, tmpPramSumR);
					addParmSumR(newRsltL, tmpPramSumR);
				}
				sumRsltRow(tmpPramSumR, row);
				tmpPramSumR.mps_grp_cd(row.mps_grp_cd());
			}
			newRsltL.add(row);
		}
		addParmMaxR(newRsltL, tmpPramSumR);
		addParmSumR(newRsltL, tmpPramSumR);

		return newRsltL;
	}

	protected void addParmSumR(MCList<RsltR> newRsltL, RsltR tmpPramSumR) {
		tmpPramSumR.row_title_nm(getDispString(_MPS_SUM_QTY));
		tmpPramSumR.row_title_col(_MPS_SUM_QTY);
		newRsltL.add(tmpPramSumR.clone());
		tmpPramSumR.clear();
	}

	protected void addParmMaxR(MCList<RsltR> newRsltL, RsltR tmpPramSumR) {
		RsltR parmMaxR = RsltR.create();
		sumRsltRow(parmMaxR,
				getMpsMaxRsltL().getFirst(RsltR.$mps_grp_cd, tmpPramSumR.mps_grp_cd()));
		parmMaxR.row_title_nm(getDispString(_MPS_MAX_QTY));
		parmMaxR.row_title_col(_MPS_MAX_QTY);
		newRsltL.add(parmMaxR);
	}

	protected void sumRsltRow(RsltR sumR, RsltR addR) {
		for (int i = 0; i < _RSLT_COL_NUM; i++) {
			if (isNull(sumR.getNumber(getColnm()[i]))) {
				sumR.setNumber(getColnm()[i], addR.getNumber(getColnm()[i]));
			}
			else {
				sumR.setNumber(getColnm()[i],
						sumR.getNumber(getColnm()[i]).add(addR.getNumber(getColnm()[i])));
			}
		}
		sumR.mps_grp_cd(addR.mps_grp_cd());
		sumR.dec_place(mcframe.commonMA.meta.MA_META.QTY.scale());
		// 0以外の数値とする
		sumR.record_grp_id(MCNumber.ONE);
		sumR.record_id(MCNumber.ONE);
	}
	
	/**
	 * 一覧（一覧、日次生産依頼一覧）の検索結果を設定する。
	 */
	protected void setHiddenList(MCList<RsltR> rsltL, MCList<ReqRsltR> reqRsltL) {
		MCIndexKey idxReqKey = reqRsltL.createIndex(ReqRsltR.$itm_cd, ReqRsltR.$itm_sub1, 
				ReqRsltR.$itm_sub2, ReqRsltR.$itm_sub3, ReqRsltR.$strg_loc_cd,
				ReqRsltR.$mfg_loc_cd, ReqRsltR.$sppl_cd, ReqRsltR.$rqst_loc_cd,
				ReqRsltR.$wg_cd, ReqRsltR.$mrp_typ);
		MCNumber i = MCNumber.ZERO;
		if (!isNull(rsltL.max(RsltR.$peg_no))) {
			i = (MCNumber)rsltL.max(RsltR.$peg_no);
			i = i.add(MCNumber.ONE);
		}

		for (RsltR r : rsltL){
			if (isSame(r.row_title_col(), _PRCD_RQMT_QTY) && isNull(r.peg_no())){
				i = i.add(MCNumber.ONE);
				r.peg_no(i);
				//ＭＰＳグループマスタに登録されているＭＰＳグループＣＤのデータを出力する
				if ((!isNull(r.mps_grp_cd()) && !isNull(r.mps_grp_nm()))) {
					MCList<ReqRsltR> prcdReqL = reqRsltL.subList(idxReqKey, r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd(),
							r.mfg_loc_cd(), r.sppl_cd(), r.rqst_loc_cd(),
							r.wg_cd(), MSC_MRP_TYP.PRCD.value());
					prcdReqL.setNumberNE(ReqRsltR.$hdr_peg_no, r.peg_no());
					_reqRsltMap.put(r.peg_no(), prcdReqL);
				} else {
					r.clearAll();
				}
			}
			else if (isSame(r.row_title_col(), _RQMT_QTY) && isNull(r.peg_no())){
				i = i.add(MCNumber.ONE);
				r.peg_no(i);
				//ＭＰＳグループマスタに登録されているＭＰＳグループＣＤのデータを出力する
				if ((!isNull(r.mps_grp_cd()) && !isNull(r.mps_grp_nm()))) {
					MCList<ReqRsltR> reqL = reqRsltL.subList(idxReqKey, r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3(), r.strg_loc_cd(),
							r.mfg_loc_cd(), r.sppl_cd(), r.rqst_loc_cd(),
							r.wg_cd(), MSC_MRP_TYP.MRP.value());
					reqL.setNumberNE(ReqRsltR.$hdr_peg_no, r.peg_no());
					_reqRsltMap.put(r.peg_no(), reqL);
				} else {
					r.clearAll();
				}
			}
			if (isSame(r.row_title_col(), _SHIP_SCHD_QTY) && isNull(r.peg_no())) {
				i = i.add(MCNumber.ONE);
				r.peg_no(i);
				if (!isNull(r.mps_grp_cd()) && isNull(r.mps_grp_nm())) {
					r.clearAll();
				}
			}
		}
	}

	// - SORT ------------------------------------//

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 縦横変換クラスのソート処理を呼び出す	
		if (table == RsltTable) {
			return _vhM.sortHTable(policy);
		}
		return super.sort(table, policy);
	}

	/**
	 * 表示切替条件で_cacheRsltAllLの値を_cacheRsltViewLに反映する
	 * 
	 * @param viewL
	 * @param allL
	 */
	protected void setRsltView(MCList<RsltR> viewL, MCList<RsltR> allL) {
		viewL.setAll(allL);
	}

	/**
	 * 上部テーブルと下部テーブルの更新ステータスを同期させる
	 */
	protected void syncUpdSts(RsltR rsltRow){
		// 上部行は対応する下部行に１件でも更新・追加・削除が存在する場合に更新ステータスとする
		for (ReqRsltR reqRsltR : getReqRsltL().subList(ReqRsltR.$hdr_peg_no, rsltRow.peg_no())) {
			if (!reqRsltR.isStatusNone()) {
				rsltRow.setStatus(MCRow.MODIFY);
				rsltRow.check(true);
				break;
			}
		}
	}

	// ------------CellConfig------------
	protected MCCellConfig createRsltConf() {
		return new RsltConf();
	}

	public class RsltConf extends MAUDP_CellConfig {

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			if (column.getBaseRowColumnName().startsWith("qty_")) {
				return true;
			}
			else {
				return super.isQtyColumn(column);
			}
		}

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);
			if(isSame(getStatus(), UPD) || isSame(getStatus(), DEL)){
				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (column == columnRslt_check){
					if(!isSame(r.row_title_col(), _RQMT_QTY) && !isSame(r.row_title_col(), _PRCD_RQMT_QTY)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			//生産可能数行
			if (isSame(r.row_title_col(), _MPS_MAX_QTY)) {
				return _mps_max_color;
			}
			//合計行
			if (isSame(r.row_title_col(), _MPS_SUM_QTY)) {
				RsltR maxR = getRsltL().getFirst(_rsltIdx, r.mps_grp_cd(), _MPS_SUM_QTY);
				if (!isNull(maxR)) {
					if (MCCollectionUtil.contains(column, getQtys())) {
						MCNumber maxNum = maxR.getNumber(column.getBaseRowColumnName());
						MCNumber sumNum = r.getNumber(column.getBaseRowColumnName());
						if (!isNull(sumNum) && sumNum.gt(maxNum)) {
							return _mps_exc_color;
						}
					}
				}
				return _mps_sum_color;
			}
			//MPSグループヘッダ列
			if (isGrpHdr(column) || isNull(r.unit_cd())) {
				return _grp_hdr_color;
			}

			return super.getPriorBG(index, column, table, mode);
		}

		protected boolean isGrpHdr(MCColumnConfig column) {
			return column == columnRslt_mps_grp_cd || column == columnRslt_row_title_nm
					|| column == columnRslt_itm_cd || column == columnRslt_itm_sub1
					|| column == columnRslt_itm_sub2 || column == columnRslt_itm_sub3
					|| column == columnRslt_itm_nm || column == columnRslt_unit_cd
					|| column == columnRslt_unit_nm || column == columnRslt_strg_loc_cd
					|| column == columnRslt_strg_loc_nm || column == columnRslt_mps_grp_nm
					|| column == columnRslt_proc_cd || column == columnRslt_proc_nm;
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			RsltR row = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(row.row_title_col(), _RQMT_QTY) && !getCndR().disp_key_flg()){
				if (column == columnRslt_mps_grp_cd || column == columnRslt_mps_grp_nm
						|| column == columnRslt_strg_loc_cd	|| column == columnRslt_strg_loc_nm
						|| column == columnRslt_mfg_loc_cd || column == columnRslt_mfg_loc_nm
						|| column == columnRslt_sppl_cd || column == columnRslt_sppl_nm
						|| column == columnRslt_rqst_loc_cd	|| column == columnRslt_rqst_loc_nm
						|| column == columnRslt_proc_cd	|| column == columnRslt_proc_nm
						|| column == columnRslt_itm_cd || column == columnRslt_itm_sub1
						|| column == columnRslt_itm_sub2 || column == columnRslt_itm_sub3 
						|| column == columnRslt_itm_nm
						|| column == columnRslt_unit_cd || column == columnRslt_unit_nm) {

					return true;
				}
			}
			return null;
		}
	}

	protected MCCellConfig createReqRsltConf() {
		return new ReqRsltConf();
	}

	public class ReqRsltConf extends MAUDP_CellConfig {

		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if(isSame(getStatus(), UPD)){
				ReqRsltR r = (ReqRsltR) table.getBaseTable().getRow(index);
				RsltR hdr = _cacheRsltViewL.getFirst(RsltR.$peg_no, r.hdr_peg_no());
				if (hdr != null && MAC_RTN_STS_TYP.isOK(hdr.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (r.fix_flg()){
					if (!isEditableColWhenFix(column)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}

		protected boolean isEditableColWhenFix(MCColumnConfig column) {
			return columnReqRslt_check == column 
					|| columnReqRslt_intr_rmrks == column
					|| columnReqRslt_sub_char1 == column
					|| columnReqRslt_sub_char2 == column
					|| columnReqRslt_sub_char3 == column;
		}
	}

	// ------------vhM------------
	@Override
	public void screenClearBody() {
		super.screenClearBody();

		_vhM.initColInfo(MCList.create(MCRow.class));
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.clearElmColsLabel();
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		// キー列（disp_00）以外のソートを無効にする			
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			if (!c.equals(columnRslt_disp_00)) {
				c.setSortable(false);
			}
		}
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type, Set<MCColumnConfig> confSet) {
		super.customVisibleColumnConfigs(table, type, confSet);
		if (type == COLUMN_WIDTH_PANEL) {
			confSet.addAll(Arrays.asList(getQtys()));
		}
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		// キー列（disp_00）をソート対象にする
		RsltTable.addSortColumn(columnRslt_disp_00, SortType.ASC);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		// 横テーブルの「ソート順変更」を無効にする	
		if (beans == RsltTable) {
			config.ignoreSortOrder(true);
		}
		return config;
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装	
	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		// テーブルのソート処理。縦横変換クラスから呼び出される。
		return super.sort(table, policy);
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装	
	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		_vhM.calcHSum(getRsltL(), (RsltR) row);
	}

	/**
	 * 処理対象RowのRowTitleColが渡される文字列に含まれる場合はtrueを返す
	 */
	protected <R extends MCConstRow> DispMatcher<R> crtDispMatcher(String[] str) {
		return new DispMatcher<R>(str);
	}

	public class DispMatcher<R extends MCConstRow> implements MCRowMatcher<R> {

		protected String[] _str;

		public DispMatcher(String[] str) {
			_str = str;
		}

		public boolean match(R r) {
			for (String s : _str) {
				if (isSame(r.getStringNE("row_title_col"), s)) {
					return true;
				}
			}
			return false;
		}
	}

	protected String[] getDispString(LinkedList<String[]> list, MCRow hdrR, String[] hdrFlgs, boolean booNullRow) {
		int flgCnt = hdrFlgs.length;

		// [1] 引数の取込
		// Listの取得
		String[] strDispAll = list.get(0);// 全表示用
		String[] strDispChng0 = list.get(1);// 基本表示用

		// [2] 画面表示するRow数の取得
		int len = strDispChng0.length;

		// strDispChgの可変長部分
		for (int i = 0; i < flgCnt; i++) {

			boolean boo = hdrR.getBooleanNE(hdrFlgs[i]);
			if (boo) {
				len = len + list.get(i + 2).length;
			}
		}

		// 最終行のNull行
		if (booNullRow) {
			len++;
		}

		// [3] strDisp(戻り)に値をセット
		String[] strDisp = new String[len];
		int cnt = 0;

		// 全表示でループ
		for (String s : strDispAll) {

			int end = 0;

			// 基本表示
			for (String s0 : strDispChng0) {
				if (isSame(s, s0)) {
					strDisp[cnt] = s;
					cnt++;
					end++;
					break;
				}
			}

			if (end != 0) continue;

			// strDispChngの可変長部分
			for (int i = 0; i < flgCnt; i++) {

				boolean boo = hdrR.getBooleanNE(hdrFlgs[i]);
				if (boo) {

					for (String s1 : list.get(i + 2)) {
						if (isSame(s, s1)) {
							strDisp[cnt] = s;
							cnt++;
							end++;
							break;
						}
					}
				}
				if (end != 0) break;
			}
			if (end != 0) continue;
		}

		// 最終行のNull行
		if (booNullRow) {
			strDisp[len - 1] = null;
		}

		return strDisp;

	}

	/**
	 * 先行手配用所要を選択しているかどうか
	 * @return
	 */
	protected boolean isPrcdReq() {
		return _prcdReq;
	}

}