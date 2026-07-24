package mcframe.clientMGBF.MGBFP0430;

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
import mcframe.clientMGUC.MGUCP0060.MGUCP_CostUtil;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_WipLocYmSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_WipLocYmSrch_MC extends MGBFP_WipLocYmSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 可変カラム名称(amt_xx)の桁数 */
	protected int _AMT_COL_SCALE = 2;
	/** 可変カラムの数 */
	protected int _amt_col_num = 0;
	/** 縦横変換ユーティリティ */
	protected MGUCP_VHConverter<RsltR, DispRsltR> _vh = new MGUCP_VHConverter<RsltR, DispRsltR>();
	/** 検索時の検索条件（画面遷移用に検索時点の条件を保持） */
	protected CndR _cndR;
	/** 可変カラムとヘッダ年月のマップ(画面遷移用) */
	protected Map<MCColumnConfig, MCDate> _ymMap = new HashMap<MCColumnConfig, MCDate>();
	/** 金額種類の情報(String[] {[項目], [項目名ラベル], [数量カラム名]}) */
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
	public MGBFP_WipLocYmSrch_MC() {
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
	public MGBFP_WipLocYmSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0430_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0430_Srch01Caller<P extends MGBFP_WipLocYmSrch, B extends MG_MGBFL0430_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0430_Srch01Caller(P p, B b) {
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
			checkForCallStackSubCom(msgList);
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			showDispRslt(bridge.down0());
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

	/**
	 * [MG_MGBFL0430_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0430_Srch02Caller<P extends MGBFP_WipLocYmSrch, B extends MG_MGBFL0430_Srch02Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0430_Srch02Caller(P p, B b) {
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
			checkForCallStackSubCom(msgList);
		}

		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			showDispRslt(bridge.down0());
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

	// Srch01 Srch02 共通処理　ここから
	/** 共通通信前チェック */
	protected void checkForCallStackSubCom(MCMessageList msgList) {
		msgList.addAll(checkBeforeAfter(Cnd_ym_fr, Cnd_ym_to));
		msgList.addAll(checkTermM(Cnd_ym_fr, Cnd_ym_to, 60));
	}

	protected void showDispRslt(MCList<RsltR> down) {
		setDispFlg();

		// 検索時点の条件を保持
		_cndR = getCndR().clone();

		// 年月情報(横展開のキー)を作成する
		MCList<RsltR> ymList = _vh.createElmListForYM(_cndR.ym_fr(), _cndR.ym_to());

		// 可変カラム情報設定
		_vh.initColInfo(_AMT_COL_SCALE, ymList.size(), ymList, 0, _amt_col_num);
		// 下り電文(縦リスト)加工・縦横変換処理
		_vh.createHList(editVList(down));
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

		// 項目別データ(月初仕掛、発生、製造品投入、完成、月末仕掛)を作成する
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

	/** 種別によって集計行を編集 */
	protected void setDispFlg() {
		if (Cnd_ope_DPT.isSelected()) {
			getCndR().disp_calc_grp_flg(true);
			getCndR().disp_wg_flg(true);
			getCndR().disp_mng_dpt_flg(true);
		}
		else {
			getCndR().disp_calc_grp_flg(getCndR().calc_grp_flg());
			getCndR().disp_wg_flg(getCndR().wg_flg());
			getCndR().disp_mng_dpt_flg(getCndR().mng_dpt_flg());
		}

	}
	// Srch01 Srch02 共通処理　ここまで

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
		if (Cnd_ope_LOC.isSelected()) {
			callMG_MGBFL0430_Srch01();
		}
		else {
			callMG_MGBFL0430_Srch02();
		}
	}

	/** 項目列の情報(String[] {[項目], [項目名ラベル], [金額カラム名]})を取得する */
	protected ArrayList<String[]> getAmtList() {
		if (_amtList == null) {
			_amtList = new ArrayList<>();
			//String[]{[項目], [項目名ラベル], [金額カラム名]}
			_amtList.add(new String[] {RsltR.$st_wip_amt, getDispString("label_st_wip_amt"), RsltR.$st_wip_amt});
			_amtList.add(new String[] {RsltR.$prod_amt, getDispString("label_prod_amt"), RsltR.$prod_amt});
			_amtList.add(new String[] {RsltR.$inpt_amt, getDispString("label_inpt_amt"), RsltR.$inpt_amt});
			_amtList.add(new String[] {RsltR.$comp_amt, getDispString("label_comp_amt"), RsltR.$comp_amt});
			_amtList.add(new String[] {RsltR.$end_wip_amt, getDispString("label_end_wip_amt"), RsltR.$end_wip_amt});
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
		DispRslt_amt_12_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_13_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_14_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_15_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_16_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_17_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_18_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_19_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_20_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_21_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_22_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_23_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_24_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_25_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_26_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_27_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_28_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_29_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_30_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_31_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_32_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_33_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_34_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_35_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_36_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_37_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_38_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_39_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_40_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_41_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_42_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_43_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_44_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_45_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_46_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_47_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_48_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_49_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_50_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_51_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_52_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_53_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_54_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_55_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_56_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_57_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_58_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_amt_59_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
		DispRslt_ttl_amt_p_PPanel.setRelateBeans(Cnd_cur_cd, Cnd_amt_dec_place);
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();
		DispRsltTable.addSortColumn(columnDispRslt_calc_grp_cd);
		DispRsltTable.addSortColumn(columnDispRslt_wg_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_cd);
		DispRsltTable.addSortColumn(columnDispRslt_mng_dpt_nm);
		DispRsltTable.addSortColumn(columnDispRslt_site_cd);
		DispRsltTable.addSortColumn(columnDispRslt_loc_cd);
		DispRsltTable.addSortColumn(columnDispRslt_str_ln_cd);
		DispRsltTable.addSortColumn(columnDispRslt_elm_no);
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
		setValueEx(Cnd_cur_cd, getBaseCur().cur_cd());
		setValueEx(Cnd_amt_dec_place, getBaseCur().amt_dec_place());
		//集計タブの初期条件
		setValueEx(Cnd_loc_flg, true);

		mcframe.clientMAUC.MAUCP0020.TermR term = getTermInfo(this);
		if (term != null) {
			setValueEx(Cnd_ym_fr, term.term());
			setValueEx(Cnd_ym_to, term.term_end_ym().addMonth(-1));
		}

		displayColumn();
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

	// -----------------------------------------------
	// status
	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_LOC.isSelected()) {
			setSRCH_LOCStatus();
		}
		else if (Cnd_ope_DPT.isSelected()) {
			setSRCH_DPTStatus();
		}
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		// 検索後ステータス
		if (Cnd_ope_LOC.isSelected()) {
			setREF_LOCStatus();
		}
		else if (Cnd_ope_DPT.isSelected()) {
			setREF_DPTStatus();
		}
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCH_LOCStatus() {
		super.setSRCH_LOCStatus();
		//可変カラムをすべてINVISIBLEにする
		_vh.clearElmColsLabel();
		_vh.setInvisibleColumnAll();
		setStatusCom();
	}

	@Override
	public void setSRCH_DPTStatus() {
		super.setSRCH_DPTStatus();
		//可変カラムをすべてINVISIBLEにする
		_vh.clearElmColsLabel();
		_vh.setInvisibleColumnAll();
		setStatusCom();
	}

	@Override
	public void setREF_LOCStatus() {
		super.setREF_LOCStatus();
		//可変カラムの未使用部分をINVISIBLEにします。
		_vh.setReadOnlyStatus();
		setStatusCom();
	}

	@Override
	public void setREF_DPTStatus() {
		super.setREF_DPTStatus();
		//可変カラムの未使用部分をINVISIBLEにします。
		_vh.setReadOnlyStatus();
		setStatusCom();
	}

	protected void setStatusCom() {
		setFocus();
		setTabMode();
		displayColumn();
	}

	protected void displayColumn() {
		changeColumnMode(DispRsltTable, getCndR(), RsltR.$$SHOW);
	}

	protected void setFocus() {
		if (getRsltL().isEmpty()) {
			CndPanel.focusFirstComponent();
		}
		else {
			DispRsltTable.selectLeftmostColumn(0);
		}
	}

	protected void setTabMode() {
		if (Cnd_ope_LOC.isSelected()) {
			setTabComponentEnable(FoldTab, Tab1Panel, Tab2Panel);
		}
		else {
			setTabComponentEnable(FoldTab, Tab1Panel);
		}
	}

	// -----------------------------------------------
	// Event
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL());
		clearContainers(getDispRsltL());
		clearInvalidCnd();
		setSrchStatus();
	}

	/** 検索条件に使用されない項目をクリアする */
	protected void clearInvalidCnd() {
		if (Cnd_ope_LOC.isSelected()) {
			setValueEx(Cnd_dpt_lvl_cd, null);
		}
		else if(Cnd_ope_DPT.isSelected()) {
			setValueEx(Cnd_site_cd, null);
			setValueEx(Cnd_site_nm, null);
			setValueEx(Cnd_loc_cd, null);
			setValueEx(Cnd_loc_nm, null);
			setValueEx(Cnd_str_ln_cd, null);
			setValueEx(Cnd_str_ln_nm, null);
		}
	}

	@Override
	public void doCnd_loc_flg_NC(MCEventInfo info) {
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
				doDispRslt_disp_DC(getDispRsltL().get(idx), column);
			}
		}
	}

	/**
	 * [DispRslt]テーブルの月別原価の項目のＤＣイベントで実行される。
	 */
	protected void doDispRslt_disp_DC(DispRsltR r, MCColumnConfig column) {

		MCDate ym = _ymMap.get(column);
		String calcGrp = getCalcGrp(r);

		if (isNullOr(ym, calcGrp)) {
			return;
		}

		openMGBFP0210(r, column);
	}

	protected void openMGBFP0210(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener scrnOpnr = getMGBFP0210ScrnOpnr(r, column);
		scrnOpnr.show();
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

	protected MAUCP_AppScreenOpener getMGBFP0210ScrnOpnr(DispRsltR r, MCColumnConfig column) {
		MAUCP_AppScreenOpener so = new MAUCP_AppScreenOpener("MG", "MGBFP0210");
		mcframe.clientMGBF.MGBFP0210.CndR cnd = mcframe.clientMGBF.MGBFP0210.CndR.create();
		mcframe.clientMGBF.MGBFP0210.MGBFP_WipLocSrch p =
				(mcframe.clientMGBF.MGBFP0210.MGBFP_WipLocSrch) so.getPanel();

		String calcGrp = getCalcGrp(r);
		MCDate ym = _ymMap.get(column);
		String calcNo = MGUCP_CostUtil.getCalcNoByYm(calcGrp, ym, this);

		cnd.calc_grp_cd(calcGrp);
		if (!isNull(calcNo)) {
			cnd.calc_no(calcNo);
			cnd.ym(ym);
		}

		if (Cnd_ope_LOC.isSelected()) {
			cnd.ope(p.Cnd_ope_LOC.getActionCommand());
		}
		else {
			cnd.ope(p.Cnd_ope_DPT.getActionCommand());
			cnd.dpt_lvl_cd(_cndR.dpt_lvl_cd());
		}
		cnd.wg_cd(r.wg_cd());
		cnd.mng_dpt_cd(r.mng_dpt_cd());
		cnd.site_cd(r.site_cd());
		cnd.loc_cd(r.loc_cd());
		cnd.str_ln_cd(r.str_ln_cd());

		so.runValueInit();
		so.putCnd(cnd);
		so.putSearchAction();

		return so;
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


	// ///////////////////// CellConfig ///////////////////////////////////////

	protected DispRsltTableCellConfig createDispRsltTableCellConfig() {
		return new DispRsltTableCellConfig();
	}

	protected class DispRsltTableCellConfig extends MGUDP_CellConfig {

		// 一覧の各キー先頭行色の設定
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			DispRsltR row = (DispRsltR) table.getBaseTable().getRow(index);
			if (isStWipRow(row)) {
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
					&& !isStWipRow(row)
					&& getRevFgCtrlColumnConfigs().contains(column)) {
				return true;
			}
			return null;
		}
	}

	/** 月初仕掛行であるかを返す */
	protected boolean isStWipRow(DispRsltR r) {
		return r != null && isSame(r.elm(), RsltR.$st_wip_amt);
	}

}