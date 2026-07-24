package mcframe.clientMABG.MABGP0280;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMABG.MABGP0280.MABGP_AlcRuleReg_MC.MA_MABGL0280_Srch01Caller;
import mcframe.clientMABG.MABGP0280.MABGP_AlcRuleReg_MC.MA_MABGL0280_Upd01Caller;
import mcframe.clientMABG.MABGP0280.MABGP_AlcRuleReg_MC.MA_MABGL0280_Del01Caller;

/**
 * 画面"MABGP_AlcRuleReg"パネルクラスです。<p>
 *
 * 配賦方法マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_AlcRuleReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term_fr;	// [Cnd]の[term_p.term_fr]を[Cnd_term_fr]としてエイリアス定義。
	public MCTextField Cnd_term_fr_nm;	// [Cnd]の[term_p.term_fr_nm]を[Cnd_term_fr_nm]としてエイリアス定義。
	public MCDateComboBox Cnd_term_to;	// [Cnd]の[term_p.term_to]を[Cnd_term_to]としてエイリアス定義。
	public MCTextField Cnd_term_to_nm;	// [Cnd]の[term_p.term_to_nm]を[Cnd_term_to_nm]としてエイリアス定義。
	public MCLabel Cnd_alc_ptn_cd_Label = null;
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_ptn_cd = null;
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public MCTextField Cnd_alc_ptn_nm = null;
	public MCLabel Cnd_alc_tgt_typ_Label = null;
	/**
	 * Allocation target type 配賦対象区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_tgt_typ = null;
	/**
	 * Allocation target type name 配賦対象区分名.<p>
	 *
	 */
	public MCTextField Cnd_alc_tgt_typ_nm = null;
	public MCLabel Cnd_alc_rule_typ_Label = null;
	/**
	 * Allocation basis type 配賦方法区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_alc_rule_typ = null;
	/**
	 * Allocation basis type name 配賦方法区分名.<p>
	 *
	 */
	public MCTextField Cnd_alc_rule_typ_nm = null;
	public MCLabel Cnd_expns_cd_Label = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCTextField Cnd_expns_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0280.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Dtl_term_p_PPanel;
	public MCColumnConfig columnDtl_term;// [Dtl]の[term_p.term]を[columnDtl_term]としてエイリアス定義。
	public MCColumnConfig columnDtl_term_nm;// [Dtl]の[term_p.term_nm]を[columnDtl_term_nm]としてエイリアス定義。
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ptn_cd = null;
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ptn_nm = null;
	/**
	 * Allocation target type 配賦対象区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_tgt_typ = null;
	/**
	 * Allocation target type name 配賦対象区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_tgt_typ_nm = null;
	/**
	 * Allocation basis type 配賦方法区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_rule_typ = null;
	/**
	 * Allocation basis type name 配賦方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_rule_typ_nm = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_nm = null;
	/**
	 * Variance calculation type 差異計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_diff_calc_typ = null;
	/**
	 * Variance calculation type name 差異計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_diff_calc_typ_nm = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rnd_typ = null;
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rnd_typ_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	/**
	 * Allocation coefficient cd. 配賦係数ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_coef_cd = null;
	/**
	 * Allocation coefficient name 配賦係数名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_coef_nm = null;
	/**
	 * Limited allocation coefficient 配賦係数限定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_coef_limit_flg = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ_nm = null;
	/**
	 * Not for minus マイナス対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_minus_flg = null;
	/**
	 * Not for subcontracting 外注対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_os_flg = null;
	/**
	 * Delivery destination allocation 納品先配賦.<p>
	 *
	 */
	public MCColumnConfig columnDtl_scst_alc_flg = null;
	/**
	 * Standard allocation 標準配賦.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_alc_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Man-hour allocation master entry 工数配賦マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0290 = null;
	/**
	 * Cost element allocation master entry 費目配賦マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0300 = null;
	/**
	 * Input allocation master entry 投入配賦マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0310 = null;
	/**
	 * Optional value allocation master entry 任意基準値配賦マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0320 = null;
	/**
	 * General purpose allocation master entry 汎用配賦マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0330 = null;
	/**
	 * Allocation coefficient structure master entry 配賦係数構成マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABGP0250 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABGL0280_Srch01]のCallerの作成 */
	protected MABGP_AlcRuleReg_MC.MA_MABGL0280_Srch01Caller createMA_MABGL0280_Srch01() {
		MABGP_AlcRuleReg_MC.MA_MABGL0280_Srch01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Srch01Bridge>
		caller = ((MABGP_AlcRuleReg_MC)this).new MA_MABGL0280_Srch01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Srch01Bridge>(
					(MABGP_AlcRuleReg)this, new MA_MABGL0280_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0280_Srch01]の呼び出し */
	protected void callMA_MABGL0280_Srch01() {
		MCCaller caller = createMA_MABGL0280_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0280_Upd01]のCallerの作成 */
	protected MABGP_AlcRuleReg_MC.MA_MABGL0280_Upd01Caller createMA_MABGL0280_Upd01() {
		MABGP_AlcRuleReg_MC.MA_MABGL0280_Upd01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Upd01Bridge>
		caller = ((MABGP_AlcRuleReg_MC)this).new MA_MABGL0280_Upd01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Upd01Bridge>(
					(MABGP_AlcRuleReg)this, new MA_MABGL0280_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0280_Upd01]の呼び出し */
	protected void callMA_MABGL0280_Upd01() {
		MCCaller caller = createMA_MABGL0280_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0280_Del01]のCallerの作成 */
	protected MABGP_AlcRuleReg_MC.MA_MABGL0280_Del01Caller createMA_MABGL0280_Del01() {
		MABGP_AlcRuleReg_MC.MA_MABGL0280_Del01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Del01Bridge>
		caller = ((MABGP_AlcRuleReg_MC)this).new MA_MABGL0280_Del01Caller<MABGP_AlcRuleReg, MA_MABGL0280_Del01Bridge>(
					(MABGP_AlcRuleReg)this, new MA_MABGL0280_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0280_Del01]の呼び出し */
	protected void callMA_MABGL0280_Del01() {
		MCCaller caller = createMA_MABGL0280_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0280.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0280.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0280.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0280.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0280.CndR createCndR() {
		return mcframe.clientMABG.MABGP0280.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0280.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0280.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0280.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0280.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0280.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0280.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDtlL()) return "Dtl";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Dtl")) return getDtlL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_AlcRuleReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_AlcRuleReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_AlcRuleReg_MC.jbCreateScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateTop((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateFold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateCnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateCtrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateDtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateDtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbCreateEastBtn((MABGP_AlcRuleReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_AlcRuleReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABGP_AlcRuleReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABGP_AlcRuleReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_AlcRuleReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term_fr = p.Cnd_term_p_PPanel.Term_term_fr;
		p.Cnd_term_fr.addAliasName("Cnd.term_fr", p);
		p.Cnd_term_fr_nm = p.Cnd_term_p_PPanel.Term_term_fr_nm;
		p.Cnd_term_fr_nm.addAliasName("Cnd.term_fr_nm", p);
		p.Cnd_term_to = p.Cnd_term_p_PPanel.Term_term_to;
		p.Cnd_term_to.addAliasName("Cnd.term_to", p);
		p.Cnd_term_to_nm = p.Cnd_term_p_PPanel.Term_term_to_nm;
		p.Cnd_term_to_nm.addAliasName("Cnd.term_to_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABGP_AlcRuleReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_AlcRuleReg p) {
		p.Dtl_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMABG.MABGP0280.DtlR.$term_p);
		p.Dtl_term_p_PPanel.setName("Dtl.term_p");
		p.columnDtl_term = p.Dtl_term_p_PPanel.columnTerm_term;
		p.columnDtl_term.addAliasName("Dtl.term", p);
		p.columnDtl_term_nm = p.Dtl_term_p_PPanel.columnTerm_term_nm;
		p.columnDtl_term_nm.addAliasName("Dtl.term_nm", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_AlcRuleReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_AlcRuleReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_AlcRuleReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_alc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alc_ptn_cd_p = null;

	/**
	 * [Cnd_alc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_ptn_cd_ListPutter() {
		if (Cnd_alc_ptn_cd_p == null) {
			Cnd_alc_ptn_cd_p = createCnd_alc_ptn_cd_ListPutter(Cnd_alc_ptn_cd, "alc_ptn_cd", "alc_ptn_nm");

		}
		return Cnd_alc_ptn_cd_p;
	}
	
	
	/** [Cnd_alc_tgt_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alc_tgt_typ_p = null;

	/**
	 * [Cnd_alc_tgt_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_tgt_typ_ListPutter() {
		if (Cnd_alc_tgt_typ_p == null) {
			Cnd_alc_tgt_typ_p = createCnd_alc_tgt_typ_ListPutter(Cnd_alc_tgt_typ, "alc_tgt_typ", "alc_tgt_typ_nm");

		}
		return Cnd_alc_tgt_typ_p;
	}
	
	
	/** [Cnd_alc_rule_typ_ListPutter]の定義 */
	private MCListPutter Cnd_alc_rule_typ_p = null;

	/**
	 * [Cnd_alc_rule_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alc_rule_typ_ListPutter() {
		if (Cnd_alc_rule_typ_p == null) {
			Cnd_alc_rule_typ_p = createCnd_alc_rule_typ_ListPutter(Cnd_alc_rule_typ, "alc_rule_typ", "alc_rule_typ_nm");

		}
		return Cnd_alc_rule_typ_p;
	}
	
	
	/** [Cnd_expns_cd_ListPutter]の定義 */
	private MCListPutter Cnd_expns_cd_p = null;

	/**
	 * [Cnd_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_expns_cd_ListPutter() {
		if (Cnd_expns_cd_p == null) {
			Cnd_expns_cd_p = createCnd_expns_cd_ListPutter(Cnd_expns_cd, "expns_cd", "expns_nm");

		}
		return Cnd_expns_cd_p;
	}
	
	
	/** [Dtl_alc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ptn_cd_p = null;

	/**
	 * [Dtl_alc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ptn_cd_ListPutter() {
		if (Dtl_alc_ptn_cd_p == null) {
			Dtl_alc_ptn_cd_p = createDtl_alc_ptn_cd_ListPutter(columnDtl_alc_ptn_cd, "alc_ptn_cd", "alc_ptn_nm");

		}
		return Dtl_alc_ptn_cd_p;
	}
	
	
	/** [Dtl_alc_tgt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alc_tgt_typ_p = null;

	/**
	 * [Dtl_alc_tgt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_tgt_typ_ListPutter() {
		if (Dtl_alc_tgt_typ_p == null) {
			Dtl_alc_tgt_typ_p = createDtl_alc_tgt_typ_ListPutter(columnDtl_alc_tgt_typ, "alc_tgt_typ", "alc_tgt_typ_nm");

		}
		return Dtl_alc_tgt_typ_p;
	}
	
	
	/** [Dtl_alc_rule_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alc_rule_typ_p = null;

	/**
	 * [Dtl_alc_rule_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_rule_typ_ListPutter() {
		if (Dtl_alc_rule_typ_p == null) {
			Dtl_alc_rule_typ_p = createDtl_alc_rule_typ_ListPutter(columnDtl_alc_rule_typ, "alc_rule_typ", "alc_rule_typ_nm");

		}
		return Dtl_alc_rule_typ_p;
	}
	
	
	/** [Dtl_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_expns_cd_p = null;

	/**
	 * [Dtl_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_expns_cd_ListPutter() {
		if (Dtl_expns_cd_p == null) {
			Dtl_expns_cd_p = createDtl_expns_cd_ListPutter(columnDtl_expns_cd, "expns_cd", "expns_nm");

		}
		return Dtl_expns_cd_p;
	}
	
	
	/** [Dtl_diff_calc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_diff_calc_typ_p = null;

	/**
	 * [Dtl_diff_calc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_diff_calc_typ_ListPutter() {
		if (Dtl_diff_calc_typ_p == null) {
			Dtl_diff_calc_typ_p = createDtl_diff_calc_typ_ListPutter(columnDtl_diff_calc_typ, "diff_calc_typ", "diff_calc_typ_nm");

		}
		return Dtl_diff_calc_typ_p;
	}
	
	
	/** [Dtl_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_rnd_typ_p = null;

	/**
	 * [Dtl_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rnd_typ_ListPutter() {
		if (Dtl_rnd_typ_p == null) {
			Dtl_rnd_typ_p = createDtl_rnd_typ_ListPutter(columnDtl_rnd_typ, "rnd_typ", "rnd_typ_nm");

		}
		return Dtl_rnd_typ_p;
	}
	
	
	/** [Dtl_alc_coef_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alc_coef_cd_p = null;

	/**
	 * [Dtl_alc_coef_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_coef_cd_ListPutter() {
		if (Dtl_alc_coef_cd_p == null) {
			Dtl_alc_coef_cd_p = createDtl_alc_coef_cd_ListPutter(columnDtl_alc_coef_cd, "alc_coef_cd", "alc_coef_nm");

		}
		return Dtl_alc_coef_cd_p;
	}
	
	
	/** [Dtl_asst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_asst_typ_p = null;

	/**
	 * [Dtl_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asst_typ_ListPutter() {
		if (Dtl_asst_typ_p == null) {
			Dtl_asst_typ_p = createDtl_asst_typ_ListPutter(columnDtl_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Dtl_asst_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_AlcRuleReg create(){
		MABGP_AlcRuleReg p = new MABGP_AlcRuleReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_AlcRuleReg create(String name){
		MABGP_AlcRuleReg p = new MABGP_AlcRuleReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MABGP_AlcRuleReg_MC.jbfInitScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitTop((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitFold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitCnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitCtrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitDtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitDtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbfInitEastBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitTop((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitFold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitCnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitCtrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitDtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitDtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.jbInitEastBtn((MABGP_AlcRuleReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_alc_ptn_cd_Label = p.beansFactory.createLabel("Cnd.alc_ptn_cd_Label");
		p.Cnd_alc_ptn_cd = p.beansFactory.createTextComboBox("Cnd.alc_ptn_cd");
		p.Cnd_alc_ptn_cd.setLabel(p.Cnd_alc_ptn_cd_Label);
		p.Cnd_alc_ptn_nm = p.beansFactory.createTextField("Cnd.alc_ptn_nm");
		p.Cnd_alc_tgt_typ_Label = p.beansFactory.createLabel("Cnd.alc_tgt_typ_Label");
		p.Cnd_alc_tgt_typ = p.beansFactory.createTextComboBox("Cnd.alc_tgt_typ");
		p.Cnd_alc_tgt_typ.setLabel(p.Cnd_alc_tgt_typ_Label);
		p.Cnd_alc_tgt_typ_nm = p.beansFactory.createTextField("Cnd.alc_tgt_typ_nm");
		p.Cnd_alc_rule_typ_Label = p.beansFactory.createLabel("Cnd.alc_rule_typ_Label");
		p.Cnd_alc_rule_typ = p.beansFactory.createTextComboBox("Cnd.alc_rule_typ");
		p.Cnd_alc_rule_typ.setLabel(p.Cnd_alc_rule_typ_Label);
		p.Cnd_alc_rule_typ_nm = p.beansFactory.createTextField("Cnd.alc_rule_typ_nm");
		p.Cnd_expns_cd_Label = p.beansFactory.createLabel("Cnd.expns_cd_Label");
		p.Cnd_expns_cd = p.beansFactory.createTextComboBox("Cnd.expns_cd");
		p.Cnd_expns_cd.setLabel(p.Cnd_expns_cd_Label);
		p.Cnd_expns_nm = p.beansFactory.createTextField("Cnd.expns_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_alc_ptn_cd = p.beansFactory.createTableColumn("Dtl.alc_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ptn_nm = p.beansFactory.createTableColumn("Dtl.alc_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_alc_tgt_typ = p.beansFactory.createTableColumn("Dtl.alc_tgt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_tgt_typ_nm = p.beansFactory.createTableColumn("Dtl.alc_tgt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alc_rule_typ = p.beansFactory.createTableColumn("Dtl.alc_rule_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_rule_typ_nm = p.beansFactory.createTableColumn("Dtl.alc_rule_typ_nm", MCColumnType.TEXT);
		p.columnDtl_expns_cd = p.beansFactory.createTableColumn("Dtl.expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_expns_nm = p.beansFactory.createTableColumn("Dtl.expns_nm", MCColumnType.TEXT);
		p.columnDtl_diff_calc_typ = p.beansFactory.createTableColumn("Dtl.diff_calc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_diff_calc_typ_nm = p.beansFactory.createTableColumn("Dtl.diff_calc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rnd_typ = p.beansFactory.createTableColumn("Dtl.rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_alc_coef_cd = p.beansFactory.createTableColumn("Dtl.alc_coef_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_coef_nm = p.beansFactory.createTableColumn("Dtl.alc_coef_nm", MCColumnType.TEXT);
		p.columnDtl_coef_limit_flg = p.beansFactory.createTableColumn("Dtl.coef_limit_flg", MCColumnType.CHECK);
		p.columnDtl_asst_typ = p.beansFactory.createTableColumn("Dtl.asst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asst_typ_nm = p.beansFactory.createTableColumn("Dtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_non_minus_flg = p.beansFactory.createTableColumn("Dtl.non_minus_flg", MCColumnType.CHECK);
		p.columnDtl_non_os_flg = p.beansFactory.createTableColumn("Dtl.non_os_flg", MCColumnType.CHECK);
		p.columnDtl_scst_alc_flg = p.beansFactory.createTableColumn("Dtl.scst_alc_flg", MCColumnType.CHECK);
		p.columnDtl_std_alc_flg = p.beansFactory.createTableColumn("Dtl.std_alc_flg", MCColumnType.CHECK);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABGP0290 = p.beansFactory.createButton("DtlBtn.open_MABGP0290", "open");
		p.DtlBtn_open_MABGP0300 = p.beansFactory.createButton("DtlBtn.open_MABGP0300", "open");
		p.DtlBtn_open_MABGP0310 = p.beansFactory.createButton("DtlBtn.open_MABGP0310", "open");
		p.DtlBtn_open_MABGP0320 = p.beansFactory.createButton("DtlBtn.open_MABGP0320", "open");
		p.DtlBtn_open_MABGP0330 = p.beansFactory.createButton("DtlBtn.open_MABGP0330", "open");
		p.DtlBtn_open_MABGP0250 = p.beansFactory.createButton("DtlBtn.open_MABGP0250", "open");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.ope_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_alc_ptn_cd);
		p.Cnd_term_p_PPanel.Term_term_fr.setListType(MCListType.FREE);
		p.Cnd_term_p_PPanel.Term_term_to.setListType(MCListType.FREE);
		p.Cnd_alc_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_ptn_cd, true);
		p.Cnd_alc_ptn_cd.setLinkBeans(p.Cnd_alc_ptn_nm);
		p.CndPanel.add(p.Cnd_alc_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_alc_ptn_cd);
		p.Cnd_alc_ptn_cd.setNextBeans(p.Cnd_alc_ptn_nm);
		p.Cnd_alc_ptn_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_ptn_cd_META);
		p.CndPanel.add(p.Cnd_alc_ptn_nm);
		p.Cnd_alc_ptn_nm.setNextBeans(p.Cnd_alc_tgt_typ);
		p.Cnd_alc_ptn_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_ptn_nm, true);
		p.Cnd_alc_tgt_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_tgt_typ, true);
		p.Cnd_alc_tgt_typ.setLinkBeans(p.Cnd_alc_tgt_typ_nm);
		p.CndPanel.add(p.Cnd_alc_tgt_typ_Label);
		p.CndPanel.add(p.Cnd_alc_tgt_typ);
		p.Cnd_alc_tgt_typ.setNextBeans(p.Cnd_alc_tgt_typ_nm);
		p.Cnd_alc_tgt_typ.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_tgt_typ_META);
		p.CndPanel.add(p.Cnd_alc_tgt_typ_nm);
		p.Cnd_alc_tgt_typ_nm.setNextBeans(p.Cnd_alc_rule_typ);
		p.Cnd_alc_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_tgt_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_tgt_typ_nm, true);
		p.Cnd_alc_rule_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alc_rule_typ, true);
		p.Cnd_alc_rule_typ.setLinkBeans(p.Cnd_alc_rule_typ_nm);
		p.CndPanel.add(p.Cnd_alc_rule_typ_Label);
		p.CndPanel.add(p.Cnd_alc_rule_typ);
		p.Cnd_alc_rule_typ.setNextBeans(p.Cnd_alc_rule_typ_nm);
		p.Cnd_alc_rule_typ.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_rule_typ_META);
		p.CndPanel.add(p.Cnd_alc_rule_typ_nm);
		p.Cnd_alc_rule_typ_nm.setNextBeans(p.Cnd_expns_cd);
		p.Cnd_alc_rule_typ_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.alc_rule_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_alc_rule_typ_nm, true);
		p.Cnd_expns_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_expns_cd, true);
		p.Cnd_expns_cd.setLinkBeans(p.Cnd_expns_nm);
		p.CndPanel.add(p.Cnd_expns_cd_Label);
		p.CndPanel.add(p.Cnd_expns_cd);
		p.Cnd_expns_cd.setNextBeans(p.Cnd_expns_nm);
		p.Cnd_expns_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.expns_cd_META);
		p.CndPanel.add(p.Cnd_expns_nm);
		p.Cnd_expns_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_expns_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.expns_nm_META);
		p.setPluralValueEnable(p.Cnd_expns_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0280.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.BtnPanel);
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABGP0290.setFunctionKey(MCFunctionKey.F3);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0290);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_open_MABGP0290);
		p.DtlBtn_open_MABGP0290.setNextBeans(p.DtlBtn_open_MABGP0300);
		p.DtlBtn_open_MABGP0300.setFunctionKey(MCFunctionKey.F4);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0300);
		p.DtlBtn_open_MABGP0300.setNextBeans(p.DtlBtn_open_MABGP0310);
		p.DtlBtn_open_MABGP0310.setFunctionKey(MCFunctionKey.F18);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0310);
		p.DtlBtn_open_MABGP0310.setNextBeans(p.DtlBtn_open_MABGP0320);
		p.DtlBtn_open_MABGP0320.setFunctionKey(MCFunctionKey.F19);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0320);
		p.DtlBtn_open_MABGP0320.setNextBeans(p.DtlBtn_open_MABGP0330);
		p.DtlBtn_open_MABGP0330.setFunctionKey(MCFunctionKey.F20);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0330);
		p.DtlBtn_open_MABGP0330.setNextBeans(p.DtlBtn_open_MABGP0250);
		p.DtlBtn_open_MABGP0250.setFunctionKey(MCFunctionKey.F21);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABGP0250);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABGP_AlcRuleReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABGP_AlcRuleReg_MC.mcInitScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitTop((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitFold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitCnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitCtrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitDtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitDtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.mcInitEastBtn((MABGP_AlcRuleReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_AlcRuleReg_MC.statusInitUPD_ScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Top((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Fold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Cnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Ctrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Dtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_DtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_Btn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitUPD_EastBtn((MABGP_AlcRuleReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_AlcRuleReg_MC.statusInitFIX_ScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Top((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Fold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Cnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Ctrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Dtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_DtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_Btn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitFIX_EastBtn((MABGP_AlcRuleReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_AlcRuleReg_MC.statusInitDEL_ScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Top((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Fold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Cnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Ctrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Dtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_DtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_Btn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitDEL_EastBtn((MABGP_AlcRuleReg)this);

		// [REF]ステータスのモードの設定
		MABGP_AlcRuleReg_MC.statusInitREF_ScreenOpe((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Top((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Fold((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Cnd((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Ctrl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Dtl((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_DtlBtn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_Btn((MABGP_AlcRuleReg)this);
		MABGP_AlcRuleReg_MC.statusInitREF_EastBtn((MABGP_AlcRuleReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_AlcRuleReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABGP_AlcRuleReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABGP_AlcRuleReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_AlcRuleReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_alc_ptn_cd.setListListener(p);
		p.Cnd_alc_ptn_cd.addAllListener(p);
		p.Cnd_alc_ptn_nm.setListListener(p);
		p.Cnd_alc_ptn_nm.addAllListener(p);
		p.Cnd_alc_tgt_typ.setListListener(p);
		p.Cnd_alc_tgt_typ.addAllListener(p);
		p.Cnd_alc_tgt_typ_nm.setListListener(p);
		p.Cnd_alc_tgt_typ_nm.addAllListener(p);
		p.Cnd_alc_rule_typ.setListListener(p);
		p.Cnd_alc_rule_typ.addAllListener(p);
		p.Cnd_alc_rule_typ_nm.setListListener(p);
		p.Cnd_alc_rule_typ_nm.addAllListener(p);
		p.Cnd_expns_cd.setListListener(p);
		p.Cnd_expns_cd.addAllListener(p);
		p.Cnd_expns_nm.setListListener(p);
		p.Cnd_expns_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABGP_AlcRuleReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_AlcRuleReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_alc_ptn_cd.addAllListener(p);
		p.columnDtl_alc_ptn_cd.setListListener(p);
		p.columnDtl_alc_ptn_nm.addAllListener(p);
		p.columnDtl_alc_ptn_nm.setListListener(p);
		p.columnDtl_alc_tgt_typ.addAllListener(p);
		p.columnDtl_alc_tgt_typ.setListListener(p);
		p.columnDtl_alc_tgt_typ_nm.addAllListener(p);
		p.columnDtl_alc_tgt_typ_nm.setListListener(p);
		p.columnDtl_alc_rule_typ.addAllListener(p);
		p.columnDtl_alc_rule_typ.setListListener(p);
		p.columnDtl_alc_rule_typ_nm.addAllListener(p);
		p.columnDtl_alc_rule_typ_nm.setListListener(p);
		p.columnDtl_expns_cd.addAllListener(p);
		p.columnDtl_expns_cd.setListListener(p);
		p.columnDtl_expns_nm.addAllListener(p);
		p.columnDtl_expns_nm.setListListener(p);
		p.columnDtl_diff_calc_typ.addAllListener(p);
		p.columnDtl_diff_calc_typ.setListListener(p);
		p.columnDtl_diff_calc_typ_nm.addAllListener(p);
		p.columnDtl_diff_calc_typ_nm.setListListener(p);
		p.columnDtl_rnd_typ.addAllListener(p);
		p.columnDtl_rnd_typ.setListListener(p);
		p.columnDtl_rnd_typ_nm.addAllListener(p);
		p.columnDtl_rnd_typ_nm.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_alc_coef_cd.addAllListener(p);
		p.columnDtl_alc_coef_cd.setListListener(p);
		p.columnDtl_alc_coef_nm.addAllListener(p);
		p.columnDtl_alc_coef_nm.setListListener(p);
		p.columnDtl_coef_limit_flg.addAllListener(p);
		p.columnDtl_asst_typ.addAllListener(p);
		p.columnDtl_asst_typ.setListListener(p);
		p.columnDtl_asst_typ_nm.addAllListener(p);
		p.columnDtl_asst_typ_nm.setListListener(p);
		p.columnDtl_non_minus_flg.addAllListener(p);
		p.columnDtl_non_os_flg.addAllListener(p);
		p.columnDtl_scst_alc_flg.addAllListener(p);
		p.columnDtl_std_alc_flg.addAllListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABGP_AlcRuleReg p) {
		p.DtlBtn_open_MABGP0290.addAllListener(p);
		p.DtlBtn_open_MABGP0290.setAPMethodName("doDtlBtn_open_MABGP0290");
		p.DtlBtn_open_MABGP0300.addAllListener(p);
		p.DtlBtn_open_MABGP0300.setAPMethodName("doDtlBtn_open_MABGP0300");
		p.DtlBtn_open_MABGP0310.addAllListener(p);
		p.DtlBtn_open_MABGP0310.setAPMethodName("doDtlBtn_open_MABGP0310");
		p.DtlBtn_open_MABGP0320.addAllListener(p);
		p.DtlBtn_open_MABGP0320.setAPMethodName("doDtlBtn_open_MABGP0320");
		p.DtlBtn_open_MABGP0330.addAllListener(p);
		p.DtlBtn_open_MABGP0330.setAPMethodName("doDtlBtn_open_MABGP0330");
		p.DtlBtn_open_MABGP0250.addAllListener(p);
		p.DtlBtn_open_MABGP0250.setAPMethodName("doDtlBtn_open_MABGP0250");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_AlcRuleReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_AlcRuleReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_AlcRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABGP_AlcRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABGP_AlcRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_AlcRuleReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_alc_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_alc_rule_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_alc_rule_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABGP_AlcRuleReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_AlcRuleReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.REQUIRED);
		p.columnDtl_alc_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alc_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alc_rule_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_diff_calc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alc_coef_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alc_coef_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_coef_limit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_asst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_asst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_non_minus_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_non_os_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_scst_alc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_std_alc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABGP_AlcRuleReg p){
		p.DtlBtn_open_MABGP0290.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0300.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0310.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0320.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0330.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0250.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_AlcRuleReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_AlcRuleReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_AlcRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABGP_AlcRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABGP_AlcRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_AlcRuleReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_alc_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alc_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_alc_rule_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_alc_rule_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_expns_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABGP_AlcRuleReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_AlcRuleReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_alc_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_coef_limit_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_non_minus_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_non_os_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_scst_alc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_alc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABGP_AlcRuleReg p){
		p.DtlBtn_open_MABGP0290.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0300.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0310.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0320.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0330.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0250.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_AlcRuleReg p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABGP_AlcRuleReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_AlcRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABGP_AlcRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABGP_AlcRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_AlcRuleReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_alc_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_alc_rule_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_alc_rule_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_expns_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABGP_AlcRuleReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_AlcRuleReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_alc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_coef_limit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_non_minus_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_non_os_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_scst_alc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_alc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABGP_AlcRuleReg p){
		p.DtlBtn_open_MABGP0290.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_open_MABGP0300.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_open_MABGP0310.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_open_MABGP0320.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_open_MABGP0330.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_open_MABGP0250.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_AlcRuleReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_AlcRuleReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_AlcRuleReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABGP_AlcRuleReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABGP_AlcRuleReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_AlcRuleReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0240.MAUBP_Term_H.ENABLE);
		p.Cnd_alc_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_alc_rule_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alc_rule_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_expns_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_expns_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABGP_AlcRuleReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_AlcRuleReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.READ_ONLY);
		p.columnDtl_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_rule_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_diff_calc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_coef_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_coef_limit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_non_minus_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_non_os_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_scst_alc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_alc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABGP_AlcRuleReg p){
		p.DtlBtn_open_MABGP0290.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0300.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0310.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0320.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0330.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABGP0250.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_AlcRuleReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_AlcRuleReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABGP_AlcRuleReg_MC.setTableConfigDtl((MABGP_AlcRuleReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_AlcRuleReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0280.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.DtlTable.addTable(p.Dtl_term_p_PPanel.TermTable);
		p.columnDtl_alc_ptn_cd.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_ptn_cd_META);
		p.columnDtl_alc_ptn_cd.addLinkBeans(p.columnDtl_alc_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ptn_cd);
		p.columnDtl_alc_ptn_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ptn_nm);
		p.columnDtl_alc_tgt_typ.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_tgt_typ_META);
		p.columnDtl_alc_tgt_typ.addLinkBeans(p.columnDtl_alc_tgt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_tgt_typ);
		p.columnDtl_alc_tgt_typ_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_tgt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_tgt_typ_nm);
		p.columnDtl_alc_rule_typ.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_rule_typ_META);
		p.columnDtl_alc_rule_typ.addLinkBeans(p.columnDtl_alc_rule_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_rule_typ);
		p.columnDtl_alc_rule_typ_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_rule_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_rule_typ_nm);
		p.columnDtl_expns_cd.setMeta(mcframe.clientMABG.MABGP0280.DtlR.expns_cd_META);
		p.columnDtl_expns_cd.addLinkBeans(p.columnDtl_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_cd);
		p.columnDtl_expns_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_nm);
		p.columnDtl_diff_calc_typ.setMeta(mcframe.clientMABG.MABGP0280.DtlR.diff_calc_typ_META);
		p.columnDtl_diff_calc_typ.addLinkBeans(p.columnDtl_diff_calc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_diff_calc_typ);
		p.columnDtl_diff_calc_typ_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.diff_calc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_diff_calc_typ_nm);
		p.columnDtl_rnd_typ.setMeta(mcframe.clientMABG.MABGP0280.DtlR.rnd_typ_META);
		p.columnDtl_rnd_typ.addLinkBeans(p.columnDtl_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rnd_typ);
		p.columnDtl_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rnd_typ_nm);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABG.MABGP0280.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.columnDtl_alc_coef_cd.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_coef_cd_META);
		p.columnDtl_alc_coef_cd.addLinkBeans(p.columnDtl_alc_coef_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_coef_cd);
		p.columnDtl_alc_coef_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.alc_coef_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_coef_nm);
		p.columnDtl_coef_limit_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.coef_limit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_coef_limit_flg);
		p.columnDtl_asst_typ.setMeta(mcframe.clientMABG.MABGP0280.DtlR.asst_typ_META);
		p.columnDtl_asst_typ.addLinkBeans(p.columnDtl_asst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ);
		p.columnDtl_asst_typ_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.asst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ_nm);
		p.columnDtl_non_minus_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.non_minus_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_minus_flg);
		p.columnDtl_non_os_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.non_os_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_os_flg);
		p.columnDtl_scst_alc_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.scst_alc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_scst_alc_flg);
		p.columnDtl_std_alc_flg.setMeta(mcframe.clientMABG.MABGP0280.DtlR.std_alc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_alc_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0280.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0280.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0280.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0280.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0280.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0280.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0280.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0280.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0280.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0280.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_alc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_ptn_cd.getListConfig().setPutter(getCnd_alc_ptn_cd_ListPutter());
		Cnd_alc_tgt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_tgt_typ.getListConfig().setPutter(getCnd_alc_tgt_typ_ListPutter());
		Cnd_alc_rule_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alc_rule_typ.getListConfig().setPutter(getCnd_alc_rule_typ_ListPutter());
		Cnd_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_expns_cd.getListConfig().setPutter(getCnd_expns_cd_ListPutter());
		columnDtl_alc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ptn_cd.getListConfig().setPutter(getDtl_alc_ptn_cd_ListPutter());
		columnDtl_alc_tgt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_tgt_typ.getListConfig().setPutter(getDtl_alc_tgt_typ_ListPutter());
		columnDtl_alc_rule_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_rule_typ.getListConfig().setPutter(getDtl_alc_rule_typ_ListPutter());
		columnDtl_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_expns_cd.getListConfig().setPutter(getDtl_expns_cd_ListPutter());
		columnDtl_diff_calc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_diff_calc_typ.getListConfig().setPutter(getDtl_diff_calc_typ_ListPutter());
		columnDtl_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rnd_typ.getListConfig().setPutter(getDtl_rnd_typ_ListPutter());
		columnDtl_alc_coef_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_coef_cd.getListConfig().setPutter(getDtl_alc_coef_cd_ListPutter());
		columnDtl_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asst_typ.getListConfig().setPutter(getDtl_asst_typ_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_alc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_tgt_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_tgt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcTgtTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_alc_rule_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alc_rule_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcRuleTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProdOrSgaExpns");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_tgt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_tgt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcTgtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_rule_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_rule_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcRuleTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_diff_calc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_diff_calc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DiffCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_coef_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_coef_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcCoef");
		return lp;
	}
	 
	/**
	 * [Dtl_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_alc_ptn_cd) return getCnd_alc_ptn_cd(row, info);
		if(combo == Cnd_alc_tgt_typ) return getCnd_alc_tgt_typ(row, info);
		if(combo == Cnd_alc_rule_typ) return getCnd_alc_rule_typ(row, info);
		if(combo == Cnd_expns_cd) return getCnd_expns_cd(row, info);
		if(combo == columnDtl_alc_ptn_cd) return getDtl_alc_ptn_cd(row, info);
		if(combo == columnDtl_alc_tgt_typ) return getDtl_alc_tgt_typ(row, info);
		if(combo == columnDtl_alc_rule_typ) return getDtl_alc_rule_typ(row, info);
		if(combo == columnDtl_expns_cd) return getDtl_expns_cd(row, info);
		if(combo == columnDtl_diff_calc_typ) return getDtl_diff_calc_typ(row, info);
		if(combo == columnDtl_rnd_typ) return getDtl_rnd_typ(row, info);
		if(combo == columnDtl_alc_coef_cd) return getDtl_alc_coef_cd(row, info);
		if(combo == columnDtl_asst_typ) return getDtl_asst_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == DtlBtn_open_MABGP0290) doDtlBtn_open_MABGP0290(info);
		else if (ap == DtlBtn_open_MABGP0300) doDtlBtn_open_MABGP0300(info);
		else if (ap == DtlBtn_open_MABGP0310) doDtlBtn_open_MABGP0310(info);
		else if (ap == DtlBtn_open_MABGP0320) doDtlBtn_open_MABGP0320(info);
		else if (ap == DtlBtn_open_MABGP0330) doDtlBtn_open_MABGP0330(info);
		else if (ap == DtlBtn_open_MABGP0250) doDtlBtn_open_MABGP0250(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0290]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0290(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0300]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0300(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0310(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0320]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0320(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0330(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABGP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABGP0250(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_alc_ptn_cd) return doCnd_alc_ptn_cd_VC(info);
		if (vc == Cnd_alc_ptn_nm) return doCnd_alc_ptn_nm_VC(info);
		if (vc == Cnd_alc_tgt_typ) return doCnd_alc_tgt_typ_VC(info);
		if (vc == Cnd_alc_tgt_typ_nm) return doCnd_alc_tgt_typ_nm_VC(info);
		if (vc == Cnd_alc_rule_typ) return doCnd_alc_rule_typ_VC(info);
		if (vc == Cnd_alc_rule_typ_nm) return doCnd_alc_rule_typ_nm_VC(info);
		if (vc == Cnd_expns_cd) return doCnd_expns_cd_VC(info);
		if (vc == Cnd_expns_nm) return doCnd_expns_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_alc_ptn_cd) return doDtl_alc_ptn_cd_VC(info);
		if (vc == columnDtl_alc_ptn_nm) return doDtl_alc_ptn_nm_VC(info);
		if (vc == columnDtl_alc_tgt_typ) return doDtl_alc_tgt_typ_VC(info);
		if (vc == columnDtl_alc_tgt_typ_nm) return doDtl_alc_tgt_typ_nm_VC(info);
		if (vc == columnDtl_alc_rule_typ) return doDtl_alc_rule_typ_VC(info);
		if (vc == columnDtl_alc_rule_typ_nm) return doDtl_alc_rule_typ_nm_VC(info);
		if (vc == columnDtl_expns_cd) return doDtl_expns_cd_VC(info);
		if (vc == columnDtl_expns_nm) return doDtl_expns_nm_VC(info);
		if (vc == columnDtl_diff_calc_typ) return doDtl_diff_calc_typ_VC(info);
		if (vc == columnDtl_diff_calc_typ_nm) return doDtl_diff_calc_typ_nm_VC(info);
		if (vc == columnDtl_rnd_typ) return doDtl_rnd_typ_VC(info);
		if (vc == columnDtl_rnd_typ_nm) return doDtl_rnd_typ_nm_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_alc_coef_cd) return doDtl_alc_coef_cd_VC(info);
		if (vc == columnDtl_alc_coef_nm) return doDtl_alc_coef_nm_VC(info);
		if (vc == columnDtl_coef_limit_flg) return doDtl_coef_limit_flg_VC(info);
		if (vc == columnDtl_asst_typ) return doDtl_asst_typ_VC(info);
		if (vc == columnDtl_asst_typ_nm) return doDtl_asst_typ_nm_VC(info);
		if (vc == columnDtl_non_minus_flg) return doDtl_non_minus_flg_VC(info);
		if (vc == columnDtl_non_os_flg) return doDtl_non_os_flg_VC(info);
		if (vc == columnDtl_scst_alc_flg) return doDtl_scst_alc_flg_VC(info);
		if (vc == columnDtl_std_alc_flg) return doDtl_std_alc_flg_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_rule_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alc_rule_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_rule_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_rule_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_diff_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_diff_calc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_coef_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_coef_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_coef_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_coef_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[coef_limit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_coef_limit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_minus_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_minus_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_os_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_os_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[scst_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_scst_alc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_alc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_alc_ptn_cd) doCnd_alc_ptn_cd_NC(info);
		else if (nc == Cnd_alc_ptn_nm) doCnd_alc_ptn_nm_NC(info);
		else if (nc == Cnd_alc_tgt_typ) doCnd_alc_tgt_typ_NC(info);
		else if (nc == Cnd_alc_tgt_typ_nm) doCnd_alc_tgt_typ_nm_NC(info);
		else if (nc == Cnd_alc_rule_typ) doCnd_alc_rule_typ_NC(info);
		else if (nc == Cnd_alc_rule_typ_nm) doCnd_alc_rule_typ_nm_NC(info);
		else if (nc == Cnd_expns_cd) doCnd_expns_cd_NC(info);
		else if (nc == Cnd_expns_nm) doCnd_expns_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_alc_ptn_cd) doDtl_alc_ptn_cd_NC(info);
		else if (nc == columnDtl_alc_ptn_nm) doDtl_alc_ptn_nm_NC(info);
		else if (nc == columnDtl_alc_tgt_typ) doDtl_alc_tgt_typ_NC(info);
		else if (nc == columnDtl_alc_tgt_typ_nm) doDtl_alc_tgt_typ_nm_NC(info);
		else if (nc == columnDtl_alc_rule_typ) doDtl_alc_rule_typ_NC(info);
		else if (nc == columnDtl_alc_rule_typ_nm) doDtl_alc_rule_typ_nm_NC(info);
		else if (nc == columnDtl_expns_cd) doDtl_expns_cd_NC(info);
		else if (nc == columnDtl_expns_nm) doDtl_expns_nm_NC(info);
		else if (nc == columnDtl_diff_calc_typ) doDtl_diff_calc_typ_NC(info);
		else if (nc == columnDtl_diff_calc_typ_nm) doDtl_diff_calc_typ_nm_NC(info);
		else if (nc == columnDtl_rnd_typ) doDtl_rnd_typ_NC(info);
		else if (nc == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_alc_coef_cd) doDtl_alc_coef_cd_NC(info);
		else if (nc == columnDtl_alc_coef_nm) doDtl_alc_coef_nm_NC(info);
		else if (nc == columnDtl_coef_limit_flg) doDtl_coef_limit_flg_NC(info);
		else if (nc == columnDtl_asst_typ) doDtl_asst_typ_NC(info);
		else if (nc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NC(info);
		else if (nc == columnDtl_non_minus_flg) doDtl_non_minus_flg_NC(info);
		else if (nc == columnDtl_non_os_flg) doDtl_non_os_flg_NC(info);
		else if (nc == columnDtl_scst_alc_flg) doDtl_scst_alc_flg_NC(info);
		else if (nc == columnDtl_std_alc_flg) doDtl_std_alc_flg_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_limit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_limit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_minus_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_minus_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_os_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_os_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scst_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scst_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_alc_ptn_cd) doCnd_alc_ptn_cd_NE(info);
		else if (ne == Cnd_alc_ptn_nm) doCnd_alc_ptn_nm_NE(info);
		else if (ne == Cnd_alc_tgt_typ) doCnd_alc_tgt_typ_NE(info);
		else if (ne == Cnd_alc_tgt_typ_nm) doCnd_alc_tgt_typ_nm_NE(info);
		else if (ne == Cnd_alc_rule_typ) doCnd_alc_rule_typ_NE(info);
		else if (ne == Cnd_alc_rule_typ_nm) doCnd_alc_rule_typ_nm_NE(info);
		else if (ne == Cnd_expns_cd) doCnd_expns_cd_NE(info);
		else if (ne == Cnd_expns_nm) doCnd_expns_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_alc_ptn_cd) doDtl_alc_ptn_cd_NE(info);
		else if (ne == columnDtl_alc_ptn_nm) doDtl_alc_ptn_nm_NE(info);
		else if (ne == columnDtl_alc_tgt_typ) doDtl_alc_tgt_typ_NE(info);
		else if (ne == columnDtl_alc_tgt_typ_nm) doDtl_alc_tgt_typ_nm_NE(info);
		else if (ne == columnDtl_alc_rule_typ) doDtl_alc_rule_typ_NE(info);
		else if (ne == columnDtl_alc_rule_typ_nm) doDtl_alc_rule_typ_nm_NE(info);
		else if (ne == columnDtl_expns_cd) doDtl_expns_cd_NE(info);
		else if (ne == columnDtl_expns_nm) doDtl_expns_nm_NE(info);
		else if (ne == columnDtl_diff_calc_typ) doDtl_diff_calc_typ_NE(info);
		else if (ne == columnDtl_diff_calc_typ_nm) doDtl_diff_calc_typ_nm_NE(info);
		else if (ne == columnDtl_rnd_typ) doDtl_rnd_typ_NE(info);
		else if (ne == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_alc_coef_cd) doDtl_alc_coef_cd_NE(info);
		else if (ne == columnDtl_alc_coef_nm) doDtl_alc_coef_nm_NE(info);
		else if (ne == columnDtl_coef_limit_flg) doDtl_coef_limit_flg_NE(info);
		else if (ne == columnDtl_asst_typ) doDtl_asst_typ_NE(info);
		else if (ne == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NE(info);
		else if (ne == columnDtl_non_minus_flg) doDtl_non_minus_flg_NE(info);
		else if (ne == columnDtl_non_os_flg) doDtl_non_os_flg_NE(info);
		else if (ne == columnDtl_scst_alc_flg) doDtl_scst_alc_flg_NE(info);
		else if (ne == columnDtl_std_alc_flg) doDtl_std_alc_flg_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_limit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_limit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_minus_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_minus_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_os_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_os_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scst_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scst_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_alc_ptn_cd) doCnd_alc_ptn_cd_NX(info);
		else if (nx == Cnd_alc_ptn_nm) doCnd_alc_ptn_nm_NX(info);
		else if (nx == Cnd_alc_tgt_typ) doCnd_alc_tgt_typ_NX(info);
		else if (nx == Cnd_alc_tgt_typ_nm) doCnd_alc_tgt_typ_nm_NX(info);
		else if (nx == Cnd_alc_rule_typ) doCnd_alc_rule_typ_NX(info);
		else if (nx == Cnd_alc_rule_typ_nm) doCnd_alc_rule_typ_nm_NX(info);
		else if (nx == Cnd_expns_cd) doCnd_expns_cd_NX(info);
		else if (nx == Cnd_expns_nm) doCnd_expns_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_alc_ptn_cd) doDtl_alc_ptn_cd_NX(info);
		else if (nx == columnDtl_alc_ptn_nm) doDtl_alc_ptn_nm_NX(info);
		else if (nx == columnDtl_alc_tgt_typ) doDtl_alc_tgt_typ_NX(info);
		else if (nx == columnDtl_alc_tgt_typ_nm) doDtl_alc_tgt_typ_nm_NX(info);
		else if (nx == columnDtl_alc_rule_typ) doDtl_alc_rule_typ_NX(info);
		else if (nx == columnDtl_alc_rule_typ_nm) doDtl_alc_rule_typ_nm_NX(info);
		else if (nx == columnDtl_expns_cd) doDtl_expns_cd_NX(info);
		else if (nx == columnDtl_expns_nm) doDtl_expns_nm_NX(info);
		else if (nx == columnDtl_diff_calc_typ) doDtl_diff_calc_typ_NX(info);
		else if (nx == columnDtl_diff_calc_typ_nm) doDtl_diff_calc_typ_nm_NX(info);
		else if (nx == columnDtl_rnd_typ) doDtl_rnd_typ_NX(info);
		else if (nx == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_alc_coef_cd) doDtl_alc_coef_cd_NX(info);
		else if (nx == columnDtl_alc_coef_nm) doDtl_alc_coef_nm_NX(info);
		else if (nx == columnDtl_coef_limit_flg) doDtl_coef_limit_flg_NX(info);
		else if (nx == columnDtl_asst_typ) doDtl_asst_typ_NX(info);
		else if (nx == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NX(info);
		else if (nx == columnDtl_non_minus_flg) doDtl_non_minus_flg_NX(info);
		else if (nx == columnDtl_non_os_flg) doDtl_non_os_flg_NX(info);
		else if (nx == columnDtl_scst_alc_flg) doDtl_scst_alc_flg_NX(info);
		else if (nx == columnDtl_std_alc_flg) doDtl_std_alc_flg_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_limit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_limit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_minus_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_minus_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_os_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_os_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scst_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scst_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_alc_ptn_cd) doCnd_alc_ptn_cd_LC(info);
		else if (lc == Cnd_alc_ptn_nm) doCnd_alc_ptn_nm_LC(info);
		else if (lc == Cnd_alc_tgt_typ) doCnd_alc_tgt_typ_LC(info);
		else if (lc == Cnd_alc_tgt_typ_nm) doCnd_alc_tgt_typ_nm_LC(info);
		else if (lc == Cnd_alc_rule_typ) doCnd_alc_rule_typ_LC(info);
		else if (lc == Cnd_alc_rule_typ_nm) doCnd_alc_rule_typ_nm_LC(info);
		else if (lc == Cnd_expns_cd) doCnd_expns_cd_LC(info);
		else if (lc == Cnd_expns_nm) doCnd_expns_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_alc_ptn_cd) doDtl_alc_ptn_cd_LC(info);
		else if (lc == columnDtl_alc_ptn_nm) doDtl_alc_ptn_nm_LC(info);
		else if (lc == columnDtl_alc_tgt_typ) doDtl_alc_tgt_typ_LC(info);
		else if (lc == columnDtl_alc_tgt_typ_nm) doDtl_alc_tgt_typ_nm_LC(info);
		else if (lc == columnDtl_alc_rule_typ) doDtl_alc_rule_typ_LC(info);
		else if (lc == columnDtl_alc_rule_typ_nm) doDtl_alc_rule_typ_nm_LC(info);
		else if (lc == columnDtl_expns_cd) doDtl_expns_cd_LC(info);
		else if (lc == columnDtl_expns_nm) doDtl_expns_nm_LC(info);
		else if (lc == columnDtl_diff_calc_typ) doDtl_diff_calc_typ_LC(info);
		else if (lc == columnDtl_diff_calc_typ_nm) doDtl_diff_calc_typ_nm_LC(info);
		else if (lc == columnDtl_rnd_typ) doDtl_rnd_typ_LC(info);
		else if (lc == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_alc_coef_cd) doDtl_alc_coef_cd_LC(info);
		else if (lc == columnDtl_alc_coef_nm) doDtl_alc_coef_nm_LC(info);
		else if (lc == columnDtl_asst_typ) doDtl_asst_typ_LC(info);
		else if (lc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alc_rule_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alc_rule_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_rule_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_rule_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_calc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_calc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_coef_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_coef_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_alc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_tgt_typ]の作成メソッド
	 */
	public MCList getCnd_alc_tgt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_alc_rule_typ]の作成メソッド
	 */
	public MCList getCnd_alc_rule_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcRuleTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_expns_cd]の作成メソッド
	 */
	public MCList getCnd_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProdOrSgaExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_alc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_tgt_typ]の作成メソッド
	 */
	public MCList getDtl_alc_tgt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_rule_typ]の作成メソッド
	 */
	public MCList getDtl_alc_rule_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcRuleTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_expns_cd]の作成メソッド
	 */
	public MCList getDtl_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_diff_calc_typ]の作成メソッド
	 */
	public MCList getDtl_diff_calc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDiffCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_coef_cd]の作成メソッド
	 */
	public MCList getDtl_alc_coef_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcCoef(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asst_typ]の作成メソッド
	 */
	public MCList getDtl_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0280.Srch01")) {
			return new MA_MABGL0280_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0280.Upd01")) {
			return new MA_MABGL0280_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0280.Del01")) {
			return new MA_MABGL0280_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0280_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0280_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0280_Srch01Bridge() {
			p_MA_MABGL0280_Srch01 = new MCParam(PDef.MA_MABGL0280_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0280_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0280.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0280.DtlR.class));

			p_MA_MABGL0280_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0280_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0280_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0280_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0280_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0280.CndR up0() {
			return (mcframe.clientMABG.MABGP0280.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0280.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0280.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0280_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0280.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0280_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0280.DtlR>)p_MA_MABGL0280_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MA_MABGL0280_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0280_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0280_Upd01Bridge() {
			p_MA_MABGL0280_Upd01 = new MCParam(PDef.MA_MABGL0280_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0280_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0280.DtlR.class));
			// Down

			p_MA_MABGL0280_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0280_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0280_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0280_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0280_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0280.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0280.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0280_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABGL0280_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0280_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0280_Del01;

		/** コンストラクタ */
		protected MA_MABGL0280_Del01Bridge() {
			p_MA_MABGL0280_Del01 = new MCParam(PDef.MA_MABGL0280_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0280_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0280.DtlR.class));
			// Down

			p_MA_MABGL0280_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0280_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0280_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0280_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0280_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0280.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0280.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0280_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}