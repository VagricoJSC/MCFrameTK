package mcframe.clientMGBF.MGBFP0450;

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
import mcframe.clientMAUB.MAUBP5030.*;

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
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import mcframe.clientMGUC.MGUCP0040.MGUCP_VHConverter;
import mcframe.clientMGUC.MGUCP0060.MGUCP_CostUtil;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_MlyOperInstCostSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_MlyOperInstCostSrch_MC extends MGBFP_MlyOperInstCostSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(qty_xx)の桁数 */
	protected int _QTY_COL_SCALE = 2;
	/** 可変カラムの数 */
	protected int _qty_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR;
	/** 可変カラムとヘッダ年月のマップ(画面遷移用) */
	protected Map<MCColumnConfig, MCDate> _ymMap = new HashMap<MCColumnConfig, MCDate>();
	/** 数量種類の情報(String[] {[項目], [項目名ラベル], [金額カラム名]}) */
	protected ArrayList<String[]> _amtList;
	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト */
	protected ArrayList<MCColumnConfig> _revFgCtrlColumnConfigs = null;
	/** 各キーの先頭行の色 */
	protected Color _topColor = getTopColor(this);
	/** 一覧行の色 */
	protected Color _tblColor = getExpnsSrchRsltColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_MlyOperInstCostSrch_MC() {
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
	public MGBFP_MlyOperInstCostSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0450_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0450_Srch01Caller<P extends MGBFP_MlyOperInstCostSrch, B extends MG_MGBFL0450_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0450_Srch01Caller(P p, B b) {
			super(p, b);
		}

		//通信前チェックより前に行われる処理
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 通信用ブロックと画面表示ブロックが異なる場合は
			// 画面表示ブロックを下りブロックとして追加する
			addDownContainer(getDispRsltL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}

		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
			msgList.addAll(checkTermM(Cnd_ym_fr, Cnd_ym_to, 60));
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			showDispRslt();
		}

		/** 縦横変換して表示用のテーブルにセットする */
		protected void showDispRslt() {

			// 検索時点の条件を保持
			_cndR = getCndR().clone();

			// 年月情報(横展開のキー)を作成する
			MCList<RsltR> ymList = _vh.createElmListForYM(_cndR.ym_fr(), _cndR.ym_to());

			// 可変カラム情報設定
			_vh.initColInfo(_QTY_COL_SCALE, ymList.size(), ymList, 0, _qty_col_num);
			// 下り電文(縦リスト)加工・縦横変換処理
			_vh.createHList(editVList(bridge.down0()));
			// 合計を計算
			_vh.calcElmColTtlAll(DispRsltR.$ttl);
			// 可変カラムのヘッダラベル設定
			_vh.setElmColsLabelForYM(ymList);

			// 画面遷移用
			_ymMap = _vh.createColElmMapForYM(ymList);
		}

		/** 縦リストの編集、縦横変換を行う前に実行する */
		protected MCList<RsltR> editVList(MCList<RsltR> down0) {

			// 表示するキー項目の単位でkey_idxを設定
			// 縦横変換時のHKEYはkey_idx, elm_no
			int i = 0;
			for (MCList<RsltR> l : down0.groupList(getKeyIdx())) {
				l.setNumber(RsltR.$key_idx, i++);
			}

			// 項目別データ(計画、実績、差、計画実績)を作成する
			MCList<RsltR> list = MCList.create(RsltR.class);
			for (RsltR row : down0) {
				int k = 0;
				for (String[] s : getAmtList()) {
					RsltR itm = row.clone();
					itm.elm_no(k++);
					itm.elm(s[0]);
					itm.elm_nm(s[1]);
					itm.amt(itm.getNumber(s[2]));
					list.add(itm);
				}
			}
			return list;
		}

		/** 集計タブに応じた縦横変換時のキー項目 */
		protected String[] getKeyIdx() {
			return getKeysByFlg(RsltR.create(), RsltR.$$SHOW, getCndR()).toArray(new String[0]);
		}

		@Override
		protected void setMode() {
			super.setMode();
			//検索後ステータス
			setREFStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSRCHStatus();
		}

	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
	}

	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setBoolean(TtlPanel, false);
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0450_Srch01();
	}

	/** 項目列の情報(String[] {[項目], [項目名ラベル], [金額カラム名]})を取得する */
	protected ArrayList<String[]> getAmtList() {
		if (_amtList == null) {
			_amtList = new ArrayList<>();
			//String[]{[項目], [項目名ラベル], [数量カラム名]}
			_amtList.add(new String[] {RsltR.$inst_cost, getDispString("label_inst_cost"), RsltR.$inst_cost});
			_amtList.add(new String[] {RsltR.$var_cost, getDispString("label_var_cost"), RsltR.$var_cost});
			_amtList.add(new String[] {RsltR.$fxd_cost, getDispString("label_fxd_cost"), RsltR.$fxd_cost});
		}
		return _amtList;
	}

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト  */
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(DispRsltTable, DispRsltR.$$CLEAR);
		}
		return _revFgCtrlColumnConfigs;
	}

	// ///////////////////// INIT /////////////////////////////////////////////

	//一覧の色の設定や入力制御を行う場合はセルコンフィグを設定する
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltTableCellConfig());
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		// 色の設定
		setColorInfo();
	}

	/**
	 * テーブルの静的な配色を設定する
	 */
	protected void setColorInfo() {
		MAUDP_CellConfig cc = (MAUDP_CellConfig) DispRsltTable.getCellConfig();
		cc.putColumnBG(DispRsltTable.getAllColumnConfigs(), _tblColor);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_calc_grp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_nm);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_jnl_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_sub3);
		DispRsltTable.addSortColumn(columnDispRslt_itm_nm);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_itm_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_lot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sublot_no);
		DispRsltTable.addSortColumn(columnDispRslt_sno1);
		DispRsltTable.addSortColumn(columnDispRslt_sno2);
		DispRsltTable.addSortColumn(columnDispRslt_sno3);
		DispRsltTable.addSortColumn(columnDispRslt_sno4);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_str_ln_cd);
		DispRsltTable.addSortColumn(columnDispRslt_bp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd4);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd5);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd6);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd7);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd8);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd9);
		DispRsltTable.addSortColumn(columnDispRslt_bp_grp_cd10);
		DispRsltTable.addSortColumn(columnDispRslt_cntry_cd);
		DispRsltTable.addSortColumn(columnDispRslt_area_cd);
		DispRsltTable.addSortColumn(columnDispRslt_oper_cd);
		DispRsltTable.addSortColumn(columnDispRslt_elm_no);
	}

	@Override
	public void mcInitStatus() {
		initVhInfo();
		super.mcInitStatus();
	}

	/** VHConverterの初期化 */
	protected void initVhInfo() {
		// カラムコンフィグを設定する
		if (_vh.getConfs() == null) {
			// 可変カラムのみをVHに設定する
			DispRsltR proto = DispRsltR.create();
			Map<String, String> map = proto.getExtMap(DispRsltR.$$ELM);
			List<MCColumnConfig> confs = new ArrayList<MCColumnConfig>();
			for (MCColumnConfig conf : DispRsltTable.getColumnConfigs()) {
				if (map.get(conf.getBaseRowColumnName()) != null) {
					confs.add(conf);
					_qty_col_num++;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
			// 値が0でも表示をnullにしない
			_vh.setDispNull(false);
		}

		// DtlRでグループ化された項目情報（）を設定
		_vh.initColGroup(DispRsltTable, getRsltL());
		// カラム情報作成
		_vh.initColInfo(_QTY_COL_SCALE, 0, null, 0, _qty_col_num);
	}

	// ///////////////////// NotificationChange イベント///////////////////////////

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		// 品目区分をオフとしたら品目区分詳細もオフとする
		if (!getCndR().itm_typ_flg()) {
			Cnd_itm_typ_d_flg.setValue(false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		// 品目区分詳細をオンにしたら品目区分もオンとする
		if (getCndR().itm_typ_d_flg()) {
			Cnd_itm_typ_flg.setValue(true);
		}
	}

	@Override
	public void doCnd_bp_cd_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_bp_cd_NC(info);
		if (!isNull(getCndR().bp_cd())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_bp_nm_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_bp_nm_NC(info);
		if (!isNull(getCndR().bp_nm())) {
			setValueEx(Cnd_no_bp_flg, false);
		}
	}

	@Override
	public void doCnd_no_bp_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doCnd_no_bp_flg_NC(info);
		if (getCndR().no_bp_flg()) {
			setValueEx(Cnd_bp_cd, null);
			setValueEx(Cnd_bp_nm, null);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
		super.doCnd_loc_flg_NC(info);
		if (!getCndR().loc_flg()) {
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	@Override
	public void doCnd_str_ln_flg_NC(MCEventInfo info) {
		super.doCnd_str_ln_flg_NC(info);
		if (getCndR().str_ln_flg()) {
			setValueEx(Cnd_loc_flg, true);
		}
	}

	// ///////////////////// POPUP ////////////////////////////////////////////

	//一覧右クリックの「カラム順・サイズ」「ソート順」などで表示される項目の設定
	//検索の度にラベル等も動的に変更されるのでキャッシュせずに都度作成されるように以下の実装する
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl,
			String type) {
		if (tbl == DispRsltTable) {
			// 動的に変わるので、キャッシュしない。
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// ポップアップで非表示にしたカラムが表示されるのを防ぐ
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
			if (!confSet.contains(columnDispRslt_ttl)) {
				confSet.add(columnDispRslt_ttl);
			}

			// ソート順
			if (isSame(SORT_ORDER_PANEL, type)) {
				confSet.add(columnDispRslt_elm_no);
			}
		}
		super.customVisibleColumnConfigs(table, type, confSet);
	}

	// ///////////////////// DoubleClicked イベント ///////////////////////////////

	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
		int idx = info.getEventIndex();
		if (compo == DispRsltTable && idx > -1) {
			MCColumnConfig column = info.getClickColumn();
			if (_vh.isVariableColumn(column)) {
				doDispRslt_qty_DC(getDispRsltL().get(idx), column);
			}
		}
	}

	/**
	 * [DispRslt]テーブルの月別原価の項目のＤＣイベントで実行される。
	 */
	protected void doDispRslt_qty_DC(DispRsltR r, MCColumnConfig column) {
		MCDate ym = _ymMap.get(column);
		String calcGrp = getCalcGrp(r);
		if (isNullOr(ym, calcGrp)) {
			return;
		}
		//工程原価一覧照会
		openMGBFP0070(r, column);
	}

	protected String getCalcGrp(DispRsltR r) {
		String calcGrp = r.getStringNE(DispRsltR.$calc_grp_cd);
		if (isNull(calcGrp)) {
			String[] calcGrps = arrayValueSplit(_cndR.calc_grp_cd());
			// 複数指定されている場合
			if (calcGrps.length > 1) {
				return null;
			}
			// 検索条件に単独指定され、かつ集計がオフの場合
			calcGrp = calcGrps[0];
		}
		return calcGrp;
	}

	//工程原価一覧照会
	protected void openMGBFP0070(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBFP0070ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//工程原価一覧照会
	protected MAUCP_AppScreenOpener getMGBFP0070ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBFP0070");
		mcframe.clientMGBF.MGBFP0070.CndR cnd = mcframe.clientMGBF.MGBFP0070.CndR.create();

		String calcGrp = getCalcGrp(r);
		MCDate ym = _ymMap.get(column);
		String calcNo = MGUCP_CostUtil.getCalcNoByYm(calcGrp, ym, this);

		cnd.calc_grp_cd(calcGrp);
		if (!isNull(calcNo)) {
			cnd.calc_no(calcNo);
			cnd.ym(ym);
		}
		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.itm_typ(r.itm_typ());
		cnd.itm_typ_d_cd(r.itm_typ_d_cd());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.itm_nm(r.itm_nm());
		cnd.lot_no(r.lot_no());
		cnd.sublot_no(r.sublot_no());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		cnd.str_ln_cd(r.str_ln_cd());
		cnd.oper_cd(r.oper_cd());
		cnd.bp_cd(r.bp_cd());
		cnd.cntry_cd(r.cntry_cd());
		cnd.area_cd(r.area_cd());
		cnd.asst_typ(r.asst_typ());

		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	// ///////////////////// Status ///////////////////////////////////////////

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();

		//可変カラムをすべてINVISIBLEにする
		_vh.clearElmColsLabel();
		_vh.setInvisibleColumnAll();

		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();

		//可変カラムの未使用部分をINVISIBLEにする
		_vh.setReadOnlyStatus();

		DispRsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}

	/** 集計タブにより表示されない項目を非表示にする */
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
	}

	// ///////////////////// CellConfig ///////////////////////////////////////

	protected DispRsltTableCellConfig createDispRsltTableCellConfig() {
		return new DispRsltTableCellConfig();
	}

	protected class DispRsltTableCellConfig extends MGUDP_CellConfig {

		// 一覧の各キー先頭行色の設定
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (isInstRow(row)) {
				return _topColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		// 一覧の文字色設定
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (!getCndR().disp_key()
					&& !isInstRow(row)
					&& getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}

	}

	/** 発生原価行であるかを返す */
	protected boolean isInstRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$inst_cost);
	}

}