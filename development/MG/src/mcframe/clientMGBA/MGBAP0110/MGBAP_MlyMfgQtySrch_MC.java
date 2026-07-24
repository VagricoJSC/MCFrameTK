package mcframe.clientMGBA.MGBAP0110;

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
import mcframe.clientMAUB.MAUBP5040.*;

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
 * 画面"MGBAP_MlyMfgQtySrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBAP_MlyMfgQtySrch_MC extends MGBAP_MlyMfgQtySrch_MC_A {

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

	/** 数量種類の情報(String[] {[項目], [項目名ラベル], [数量カラム名]}) */
	protected ArrayList<String[]> _qtyList;
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
	public MGBAP_MlyMfgQtySrch_MC() {
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
	public MGBAP_MlyMfgQtySrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBAL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0110_Srch01Caller<P extends MGBAP_MlyMfgQtySrch, B extends MG_MGBAL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBAL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 画面表示ブロックを下りブロックとして追加する
			addDownContainer(getDispRsltL());
			initCallerSubCom();
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			//縦横変換して一覧に表示する
			showDispRslt(bridge.down0());
		}

		/** 表示用のテーブルにデータをセットする */
		protected void showDispRslt(MCList<RsltR> down0) {
			showDispRsltCom(down0);
		}

		@Override
		protected void setMode() {
			super.setMode();
			//検索後ステータス
			setREF_MFGStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSRCH_MFGStatus();
		}
	}

	/**
	 * [MG_MGBAL0110_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBAL0110_Srch02Caller<P extends MGBAP_MlyMfgQtySrch, B extends MG_MGBAL0110_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBAL0110_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			// 画面表示ブロックを下りブロックとして追加する
			addDownContainer(getDispRsltL());
			initCallerSubCom();
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			//縦横変換して一覧に表示する
			showDispRslt(bridge.down0());
		}

		/** 表示用のテーブルにデータをセットする */
		protected void showDispRslt(MCList<RsltR> down0) {
			showDispRsltCom(down0);
		}

		@Override
		protected void setMode() {
			super.setMode();
			//検索後ステータス
			setREF_RQMTStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			//検索前ステータス
			setSRCH_RQMTStatus();
		}
	}

	protected void initCallerSubCom() {
		// 検索年月（期の期間）を設定
		mcframe.clientMAUC.MAUCP0020.TermR termR = getTermInfo(this, getCndR().term());
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
	protected void showDispRsltCom(MCList<RsltR> down0) {

		// 検索時点の条件を保持
		_cndR = getCndR().clone();

		// 年月情報(横展開のキー)を作成する
		MCList<RsltR> ymList = _vh.createElmListForYM(_cndR.ym_fr(), _cndR.ym_to().addMonth(-1));

		// 可変カラム情報設定
		_vh.initColInfo(_QTY_COL_SCALE, ymList.size(), ymList, 0, _qty_col_num);
		// 下り電文(縦リスト)加工・縦横変換処理
		_vh.createHList(editVListCom(down0));
		// 合計を計算
		_vh.calcElmColTtlAll(DispRsltR.$ttl);
		// 可変カラムのヘッダラベル設定
		_vh.setElmColsLabelForYM(ymList);

		// 画面遷移用
		_ymMap = _vh.createColElmMapForYM(ymList);
	}

	/** 縦リストの編集、縦横変換を行う前に実行する */
	protected MCList<RsltR> editVListCom(MCList<RsltR> down0) {

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
			for (String[] s: getQtyList()) {
				RsltR itm = row.clone();
				itm.elm_no(k++);
				itm.elm(s[0]);
				itm.elm_nm(s[1]);
				itm.qty(itm.getNumber(s[2]));
				list.add(itm);
			}
		}
		return list;
	}

	/** 集計タブに応じた縦横変換時のキー項目 */
	protected String[] getKeyIdx() {
		return getKeysByFlg(RsltR.create(), RsltR.$$SHOW, getCndR()).toArray(new String[0]);
	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setBoolean(TtlPanel, true);
		if (Cnd_ope_RQMT.isSelected()) {
			setValueEx(Cnd_site_flg, false);
			setValueEx(Cnd_loc_flg, false);
			setValueEx(Cnd_str_ln_flg, false);
		}
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
		if (Cnd_ope_MFG.isSelected()) {
			callMG_MGBAL0110_Srch01();
		}
		else {
			callMG_MGBAL0110_Srch02();
		}
	}

	/** 項目列の情報(String[] {[項目], [項目名ラベル], [数量カラム名]})を取得する */
	protected ArrayList<String[]> getQtyList() {
		if (_qtyList == null) {
			_qtyList = new ArrayList<>();
			//String[]{[項目], [項目名ラベル], [数量カラム名]}
			_qtyList.add(new String[] {RsltR.$pln_qty, getDispString("label_pln_qty"), RsltR.$pln_qty});
			_qtyList.add(new String[] {RsltR.$act_qty, getDispString("label_act_qty"), RsltR.$act_qty});
			_qtyList.add(new String[] {RsltR.$diff_qty, getDispString("label_diff_qty"), RsltR.$diff_qty});
			_qtyList.add(new String[] {RsltR.$pln_act_qty, getDispString("label_pln_act_qty"), RsltR.$pln_act_qty});
		}
		return _qtyList;
	}

	/** キー項目表示オフの場合にセルの文字の色を背景色と同じにするカラムのリスト  */
	protected ArrayList<MCColumnConfig> getRevFgCtrlColumnConfigs() {
		if (_revFgCtrlColumnConfigs == null) {
			_revFgCtrlColumnConfigs = getGroupColumnConfigs(DispRsltTable, DispRsltR.$$CLEAR);
		}
		return _revFgCtrlColumnConfigs;
	}

	// -----------------------------------------------
	// ListLogic Custom
	@Override
	public MCList getCnd_asst_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getAsstTyp(info));
		return super.getCnd_asst_typ(row, info);
	}

	/**
	 * 表示する資産区分を取得する
	 */
	protected MAC_ASST_TYP[] getAsstTyp(MCEventInfo info) {
			return new MAC_ASST_TYP[] { MAC_ASST_TYP.CO_PROD, MAC_ASST_TYP.CO_SLS };
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
		//数量部品と単位、小数部有効桁数との連携
		DispRslt_qty_00_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_01_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_02_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_03_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_04_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_05_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_06_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_07_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_08_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_09_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_10_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_qty_11_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
		DispRslt_ttl_qty_p_PPanel.setRelateBeans(columnDispRslt_unit_cd, columnDispRslt_dec_place);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
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
		DispRsltTable.addSortColumn(columnDispRslt_site_cd);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_str_ln_cd);
		DispRsltTable.addSortColumn(columnDispRslt_asst_typ);
		DispRsltTable.addSortColumn(columnDispRslt_unit_cd);
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

	@Override
	protected void tableInit() {
		super.tableInit();
		// 色の設定
		setColorInfo();
	}

	/** テーブルの静的な配色を設定する */
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
		//集計タブの初期条件
		setValueEx(Cnd_itm_flg, true);
		setValueEx(Cnd_itm_typ_flg, true);
		setValueEx(Cnd_itm_typ_d_flg, true);
		setValueEx(Cnd_itm_jnl_flg, true);

		//デフォルト計算カテゴリを初期表示
		setDefCalcCtg(Cnd_pln_calc_ctg_cd, Cnd_act_calc_ctg_cd);

		displayColumn();
	}


	// ///////////////////// NotificationChange イベント///////////////////////////

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getDispRsltL());
		
		setSrchStatus();
	}

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
			//計画登録
			if (Cnd_ope_MFG.isSelected()) {
				//製造計画登録
				openMGBAP0030(r, column);
			}
			else {
				//月次計画登録
				openMGBAP0020(r, column);
			}
		}
		else if (isActRow(r)) {
			//製造実績一覧照会
			openMGBBP0100(r, column);
		}
	}

	//月次計画登録
	protected void openMGBAP0020(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBAP0020ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//製造計画登録
	protected void openMGBAP0030(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBAP0030ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//製造実績一覧照会
	protected void openMGBBP0100(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBBP0100ScrnOpnr(r, column);
		scrnOpnr.show();
	}

	//月次計画登録
	protected MAUCP_AppScreenOpener getMGBAP0020ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBAP0020");
		mcframe.clientMGBA.MGBAP0020.CndR cnd = mcframe.clientMGBA.MGBAP0020.CndR.create();
		mcframe.clientMGBA.MGBAP0020.MGBAP_PlnRqmtReg p =
			(mcframe.clientMGBA.MGBAP0020.MGBAP_PlnRqmtReg) so.getPanel();

		cnd.ope(p.Cnd_ope_REF.getActionCommand());
		cnd.calc_ctg_cd(_cndR.pln_calc_ctg_cd());
		MCDate ym = _ymMap.get(column);
		cnd.ym_fr(ym);
		cnd.ym_to(ym);
		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.itm_jnl_cd(r.itm_jnl_cd());
		cnd.itm_typ(r.itm_typ());
		cnd.itm_typ_d_cd(r.itm_typ_d_cd());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.itm_nm(r.itm_nm());
		cnd.itm_grp_cd1(r.itm_grp_cd1());
		cnd.itm_grp_cd2(r.itm_grp_cd2());
		cnd.itm_grp_cd3(r.itm_grp_cd3());
		cnd.itm_grp_cd4(r.itm_grp_cd4());
		cnd.itm_grp_cd5(r.itm_grp_cd5());
		cnd.itm_grp_cd6(r.itm_grp_cd6());
		cnd.itm_grp_cd7(r.itm_grp_cd7());
		cnd.itm_grp_cd8(r.itm_grp_cd8());
		cnd.itm_grp_cd9(r.itm_grp_cd9());
		cnd.itm_grp_cd10(r.itm_grp_cd10());
		cnd.lot_no(r.lot_no());
		cnd.sublot_no(r.sublot_no());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		cnd.asst_typ(r.asst_typ());

		so.putCnd(cnd);
		so.runValueInit();//集計タブの初期条件は遷移先に委譲
		so.putSearchAction();

		return so;
	}

	//製造計画登録
	protected MAUCP_AppScreenOpener getMGBAP0030ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBAP0030");
		mcframe.clientMGBA.MGBAP0030.CndR cnd = mcframe.clientMGBA.MGBAP0030.CndR.create();
		mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg p =
			(mcframe.clientMGBA.MGBAP0030.MGBAP_PlnMfgReg) so.getPanel();

		cnd.ope(p.Cnd_ope_REF.getActionCommand());
		cnd.calc_ctg_cd(_cndR.pln_calc_ctg_cd());
		MCDate ym = _ymMap.get(column);
		cnd.ym_fr(ym);
		cnd.ym_to(ym);
		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.itm_jnl_cd(r.itm_jnl_cd());
		cnd.itm_typ(r.itm_typ());
		cnd.itm_typ_d_cd(r.itm_typ_d_cd());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.itm_nm(r.itm_nm());
		cnd.itm_grp_cd1(r.itm_grp_cd1());
		cnd.itm_grp_cd2(r.itm_grp_cd2());
		cnd.itm_grp_cd3(r.itm_grp_cd3());
		cnd.itm_grp_cd4(r.itm_grp_cd4());
		cnd.itm_grp_cd5(r.itm_grp_cd5());
		cnd.itm_grp_cd6(r.itm_grp_cd6());
		cnd.itm_grp_cd7(r.itm_grp_cd7());
		cnd.itm_grp_cd8(r.itm_grp_cd8());
		cnd.itm_grp_cd9(r.itm_grp_cd9());
		cnd.itm_grp_cd10(r.itm_grp_cd10());
		cnd.lot_no(r.lot_no());
		cnd.sublot_no(r.sublot_no());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		cnd.loc_cd(r.loc_cd());
		cnd.str_ln_cd(r.str_ln_cd());
		cnd.asst_typ(r.asst_typ());

		so.putCnd(cnd);
		so.runValueInit();//集計タブの初期条件は遷移先に委譲
		so.putSearchAction();

		return so;
	}

	//製造実績一覧照会
	protected MAUCP_AppScreenOpener getMGBBP0100ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBBP0100");
		mcframe.clientMGBB.MGBBP0100.CndR cnd = mcframe.clientMGBB.MGBBP0100.CndR.create();

		cnd.calc_ctg_cd(_cndR.act_calc_ctg_cd());
		MCDate ym = _ymMap.get(column);
		cnd.ym_fr(ym);
		cnd.ym_to(ym);
		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.itm_jnl_cd(r.itm_jnl_cd());
		cnd.itm_typ(r.itm_typ());
		cnd.itm_typ_d_cd(r.itm_typ_d_cd());
		cnd.itm_cd(r.itm_cd());
		cnd.itm_sub1(r.itm_sub1());
		cnd.itm_sub2(r.itm_sub2());
		cnd.itm_sub3(r.itm_sub3());
		cnd.itm_nm(r.itm_nm());
		cnd.itm_grp_cd1(r.itm_grp_cd1());
		cnd.itm_grp_cd2(r.itm_grp_cd2());
		cnd.itm_grp_cd3(r.itm_grp_cd3());
		cnd.itm_grp_cd4(r.itm_grp_cd4());
		cnd.itm_grp_cd5(r.itm_grp_cd5());
		cnd.itm_grp_cd6(r.itm_grp_cd6());
		cnd.itm_grp_cd7(r.itm_grp_cd7());
		cnd.itm_grp_cd8(r.itm_grp_cd8());
		cnd.itm_grp_cd9(r.itm_grp_cd9());
		cnd.itm_grp_cd10(r.itm_grp_cd10());
		cnd.lot_no(r.lot_no());
		cnd.sublot_no(r.sublot_no());
		cnd.sno1(r.sno1());
		cnd.sno2(r.sno2());
		cnd.sno3(r.sno3());
		cnd.sno4(r.sno4());
		cnd.loc_cd(r.loc_cd());
		cnd.str_ln_cd(r.str_ln_cd());
		cnd.asst_typ(r.asst_typ());

		so.putCnd(cnd);
		so.runValueInit();//集計タブの初期条件は遷移先に委譲
		so.putSearchAction();

		return so;
	}

	// ///////////////////// POPUP ////////////////////////////////////////////
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
			// 非表示にしたカラムがポップアップに表示されるのを防ぐ
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


	// ///////////////////// Status ///////////////////////////////////////////

	/** 参照ステータスであるかどうかを返す */
	protected boolean isRefStatus() {
		return isSame(getStatus(), REF_MFG) || isSame(getStatus(), REF_RQMT);
	}

	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_MFG.isSelected()) {
			setSRCH_MFGStatus();
		}
		else {
			setSRCH_RQMTStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setSRCH_MFGStatus() {
		super.setSRCH_MFGStatus();

		setStatusCom();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setSRCH_RQMTStatus() {
		super.setSRCH_RQMTStatus();

		clearCnds();
		setStatusCom();
		Ctrl_ctrl_PPanel.expand(true);
	}

	@Override
	public void setREF_MFGStatus() {
		super.setREF_MFGStatus();

		setStatusCom();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setREF_RQMTStatus() {
		super.setREF_RQMTStatus();

		setStatusCom();
		Ctrl_ctrl_PPanel.expand(false);
	}

	protected void setStatusCom() {

		displayColumn();
		displayVHColumn();

		setFocus();
	}

	protected void clearCnds() {
		if (Cnd_ope_RQMT.isSelected()) {
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_site_nm, null);
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
			setValueEx(Cnd_site_flg, false);
			setValueEx(Cnd_loc_flg, false);
			setValueEx(Cnd_str_ln_flg, false);
		}
	}

	/** 集計タブにより表示されない項目を非表示にする */
	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), DispRsltR.$$SHOW);
	}

	/** 使用しない可変カラムを非表示にする */
	protected void displayVHColumn() {
		if(isRefStatus()) {
			_vh.setReadOnlyStatus();
		}
		else {
			_vh.setInvisibleColumnAll();
		}
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			FoldTab.focusActiveFirstComponent();
		}
		else {
			DispRsltTable.selectLeftmostColumn(0);
		}
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
		return r != null && isSame(r.elm(), RsltR.$pln_qty);
	}

	/** 実績行であるかを返す */
	protected boolean isActRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$act_qty);
	}

}