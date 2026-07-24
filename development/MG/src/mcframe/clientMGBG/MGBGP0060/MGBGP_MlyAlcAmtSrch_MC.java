package mcframe.clientMGBG.MGBGP0060;

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
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5050.*;

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
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBGP_MlyAlcAmtSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBGP_MlyAlcAmtSrch_MC extends MGBGP_MlyAlcAmtSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(qty_xx)の桁数 */
	protected int _AMT_COL_SCALE = 2;
	/** 可変カラムの数 */
	protected int _amt_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();

	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR;
	/** 可変カラムとヘッダ年月のマップ(画面遷移用) */
	protected Map<MCColumnConfig, MCDate> _ymMap = new HashMap<MCColumnConfig, MCDate>();

	/** 数量種類の情報(String[] {[項目], [項目名ラベル], [数量カラム名]}) */
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
	public MGBGP_MlyAlcAmtSrch_MC() {
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
	public MGBGP_MlyAlcAmtSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBGL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0060_Srch01Caller<P extends MGBGP_MlyAlcAmtSrch, B extends MG_MGBGL0060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBGL0060_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}
		
		/** 
		 * 操作種別の値を設定
		 */
		protected void initCallerSub() {
			if (Cnd_pre_alc_typ_BEFORE.isSelected()) {
				getCndR().not_my_wg_flg(true);
				getCndR().not_pre_alc_fin_flg(false);	
			}
			else {
				getCndR().not_my_wg_flg(false);
				getCndR().not_pre_alc_fin_flg(true);				
			}
			
			addDownContainer(getDispRsltL());

			mcframe.clientMAUC.MAUCP0020.TermR termR = getTermInfo(panel, getCndR().term());
			if (!isNull(termR)) {
				getCndR().ym_fr(termR.term());
				getCndR().ym_to(termR.term_end_ym());
			}
			else {
				getCndR().ym_fr(null);
				getCndR().ym_to(null);
			}
		}

		/** 表示用のテーブルにデータをセットする */
		@Override
		protected void showReplaceSub() {

			// 検索時点の条件を保持
			_cndR = getCndR().clone();

			// 年月情報(横展開のキー)を作成する
			MCList<RsltR> ymList = _vh.createElmListForYM(_cndR.ym_fr(), _cndR.ym_to().addMonth(-1));

			// 可変カラム情報設定
			_vh.initColInfo(_AMT_COL_SCALE, ymList.size(), ymList, 0, _amt_col_num);
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
			for(MCList<RsltR> l: down0.groupList(getKeyIdx())) {
				l.setNumber(RsltR.$key_idx, i++);
			}

			// 項目別データ(計画、実績、差、計画実績)を作成する
			MCList<RsltR> list = MCList.create(RsltR.class);
			for (RsltR row : down0) {
				int k = 0;
				for (String[] s: getAmtList()) {
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
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSrchStatus();
		}
	}
	
	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_alc_rec_typ);
		DispRsltTable.addSortColumn(columnDispRslt_alc_ac_cd);
		DispRsltTable.addSortColumn(columnDispRslt_alc_ac_grp_cd1);
		DispRsltTable.addSortColumn(columnDispRslt_alc_ac_grp_cd2);
		DispRsltTable.addSortColumn(columnDispRslt_alc_ac_grp_cd3);
		DispRsltTable.addSortColumn(columnDispRslt_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_oper_cd);
		DispRsltTable.addSortColumn(columnDispRslt_bp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_ctg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ);
		DispRsltTable.addSortColumn(columnDispRslt_itm_typ_d_cd);
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
		DispRsltTable.addSortColumn(columnDispRslt_elm_no);
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
		callMG_MGBGL0060_Srch01();
	}
	
	/** 項目列の情報(String[] {[項目], [項目名ラベル], [金額カラム名]})を取得する */
	protected ArrayList<String[]> getAmtList() {
		if (_amtList == null) {
			_amtList = new ArrayList<>();
			_amtList.add(new String[] {RsltR.$pln_amt, getDispString("label_pln_amt"), RsltR.$pln_amt});
			_amtList.add(new String[] {RsltR.$act_amt, getDispString("label_act_amt"), RsltR.$act_amt});
			_amtList.add(new String[] {RsltR.$diff_amt, getDispString("label_diff_amt"), RsltR.$diff_amt});
			_amtList.add(new String[] {RsltR.$pln_act_amt, getDispString("label_pln_act_amt"), RsltR.$pln_act_amt});
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

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DispRsltTable.setCellConfig(createDispRsltTableCellConfig());
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		setupPartsSub();
	}

	/** 埋め込み画面のセットアップ処理 */
	protected void setupPartsSub() {
		//金額部品と単位、小数部有効桁数との連携
		DispRslt_amt_00_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_01_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_02_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_03_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_04_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_05_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_06_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_07_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_08_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_09_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_10_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_11_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_ttl_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
	}

	@Override
	protected void tableInit() {
		super.tableInit();
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
		initCalcCtg();
	}

	/** 
	 * 画面起動時のデフォルト検索条件を設定
	 */
	protected void valueInitSub() {
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());
		setValueEx(Cnd_alc_ac_flg, true);
		setValueEx(Cnd_dpt_flg, true);

		displayColumn();
	}
	
	protected void initCalcCtg() {
		setDefCalcCtg(Cnd_pln_calc_ctg_cd);
		setDefCalcCtg(Cnd_act_calc_ctg_cd);
	}

	

	// ///////////////////// NotificationChange イベント///////////////////////////

	@Override
	public void doCnd_itm_typ_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_flg_NC(info);
		if (!getCndR().itm_typ_flg()) {
			Cnd_itm_typ_d_flg.setValue(false);
		}
	}

	@Override
	public void doCnd_itm_typ_d_flg_NC(MCEventInfo info) {
		super.doCnd_itm_typ_d_flg_NC(info);
		if (getCndR().itm_typ_d_flg()) {
			Cnd_itm_typ_flg.setValue(true);
		}
	}
	
	@Override
	public void doCnd_pre_alc_typ_NC(MCEventInfo info) {
		super.doCnd_pre_alc_typ_NC(info);
		clearContainers(getDispRsltL());
		setSrchStatus();
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
	 * [DispRslt]テーブルの月別数量（計画、実績）の項目のＤＣイベントで実行される。
	 */
	protected void doDispRslt_qty_DC(DispRsltR r, MCColumnConfig column) {
		if (isPlnRow(r)) {
			//配賦費用計画一覧照会
			openMGBGP0010(r, column);
		}
		else if (isActRow(r)) {
			//配賦費用実績一覧照会
			openMGBGP0020(r, column);
		}
	}
	
	//画面遷移ボタンとDCで共有できるように画面起動処理は抜き出す
	//配賦費用計画一覧照会
	protected void openMGBGP0010(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBGP0010ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//配賦費用実績一覧照会
	protected void openMGBGP0020(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBGP0020ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//配賦費用計画一覧照会
	protected MAUCP_AppScreenOpener getMGBGP0010ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0010");
		mcframe.clientMGBG.MGBGP0010.CndR cnd = mcframe.clientMGBG.MGBGP0010.CndR.create();

		cnd.calc_ctg_cd(_cndR.pln_calc_ctg_cd());
		MCDate ym = _ymMap.get(column);
		cnd.ym_fr(ym);
		cnd.ym_to(ym);
		cnd.wg_cd(r.wg_cd());
		cnd.alc_rec_typ(r.alc_rec_typ());
		cnd.alc_ac_cd(r.alc_ac_cd());
		cnd.alc_ac_grp_cd1(r.alc_ac_grp_cd1());
		cnd.alc_ac_grp_cd2(r.alc_ac_grp_cd2());
		cnd.alc_ac_grp_cd3(r.alc_ac_grp_cd3());
		cnd.dpt_cd(r.dpt_cd());
		cnd.loc_cd(r.loc_cd());
		cnd.oper_cd(r.oper_cd());
		cnd.ctg_cd(r.ctg_cd());
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

		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}

	
	//配賦費用実績一覧照会
	protected MAUCP_AppScreenOpener getMGBGP0020ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBGP0020");
		mcframe.clientMGBG.MGBGP0020.CndR cnd = mcframe.clientMGBG.MGBGP0020.CndR.create();

		cnd.calc_ctg_cd(_cndR.act_calc_ctg_cd());
		MCDate ym = _ymMap.get(column);
		cnd.ym_fr(ym);
		cnd.ym_to(ym);
		cnd.wg_cd(r.wg_cd());
		cnd.alc_rec_typ(r.alc_rec_typ());
		cnd.alc_ac_cd(r.alc_ac_cd());
		cnd.alc_ac_grp_cd1(r.alc_ac_grp_cd1());
		cnd.alc_ac_grp_cd2(r.alc_ac_grp_cd2());
		cnd.alc_ac_grp_cd3(r.alc_ac_grp_cd3());
		cnd.dpt_cd(r.dpt_cd());
		cnd.loc_cd(r.loc_cd());
		cnd.oper_cd(r.oper_cd());
		cnd.ctg_cd(r.ctg_cd());
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

		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
	}



	// ///////////////////// POPUP ////////////////////////////////////////////

	//一覧右クリックの「カラム順・サイズ」「ソート順」などで表示される項目の設定
	//検索の度にラベル等も動的に変更されるのでキャッシュせずに都度作成されるように以下の実装する
	@Override
	protected Set<MCColumnConfig> getCachedVisibleColumnConfigs(MCTable tbl, String type) {
		if (tbl == DispRsltTable) {
			// 動的に変わるので、キャッシュしない。
			return null;
		}
		return super.getCachedVisibleColumnConfigs(tbl, type);
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type, Set<MCColumnConfig> confSet) {
		if (table == DispRsltTable) {
			// ポップアップで非表示にしたカラムが表示されるのを防ぐ
			confSet.removeAll(Arrays.asList(_vh.getConfs()));
			confSet.addAll(Arrays.asList(_vh.getConfs()).subList(0, _vh.getViewSize()));
			if (!confSet.contains(columnDispRslt_ttl)) {
				confSet.add(columnDispRslt_ttl);
			}
			if (isSame(SORT_ORDER_PANEL, type)) {
				confSet.add(columnDispRslt_elm_no);
			}
		}
		super.customVisibleColumnConfigs(table, type, confSet);
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
					_amt_col_num++;
				}
			}
			_vh.setConfs(confs.toArray(new MCColumnConfig[0]));
			// 値が0でも表示をnullにしない
			_vh.setDispNull(false);
		}

		// DtlRでグループ化された項目情報（）を設定
		_vh.initColGroup(DispRsltTable, getRsltL());

		// カラム情報作成
		_vh.initColInfo(_AMT_COL_SCALE, 0, null, 0, _amt_col_num);
	}

	// ///////////////////// Status ///////////////////////////////////////////
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();

		initVhInfo();
		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();
		//可変カラムをすべてINVISIBLEにする
		_vh.clearElmColsLabel();
		_vh.setInvisibleColumnAll();

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();

		//表示しない（集計タブでオフ）列を非表示にする
		displayColumn();
		//可変カラムの未使用部分をINVISIBLEにします。
		_vh.setReadOnlyStatus();

		DispRsltTable.selectLeftmostColumn(0);
	}

	/** 集計タブにより表示されない項目を非表示にする */
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
	}
	
	
	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	
	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}


	// ///////////////////// CellConfig ///////////////////////////////////////

	protected DispRsltTableCellConfig createDispRsltTableCellConfig() {
		return new DispRsltTableCellConfig();
	}

	protected class DispRsltTableCellConfig extends MGUDP_CellConfig {

		// 一覧の各キー先頭行色の設定
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (isPlnRow(row)) {
				return _topColor;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		// 一覧の文字色設定
		//キー項目表示フラグがオフの場合は各キー先頭行以外のキー項目文字色を背景色と同じにする（⇒見えなる）
		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column, MCTable<?> table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (!getCndR().disp_key()
					&& !isPlnRow(row)
					&& getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}
	}

	/** 計画行であるかを返す */
	protected boolean isPlnRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$pln_amt);
	}

	/** 実績行であるかを返す */
	protected boolean isActRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$act_amt);
	}

}