package mcframe.serverMSBC.MSBCL6050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"MfgActReg_Upd02_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Upd02_CtrlR_MC_A extends MCConstRow {

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public static final String $act_immed_prnt_flg = "act_immed_prnt_flg";
	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public static final String $not_bkf_upd_flg = "not_bkf_upd_flg";
	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public static final String $not_wk_cost_upd_calc_flg = "not_wk_cost_upd_calc_flg";
	/**
	 * GR/GI result service call not required 受払実績サービス呼び出し不要.<p>
	 *
	 */
	public static final String $not_io_act_srv_exec_flg = "not_io_act_srv_exec_flg";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public static final String $not_commit_flg = "not_commit_flg";
	/**
	 * Call from operation result completion batch 工程実績完了バッチから呼び出す.<p>
	 *
	 */
	public static final String $is_oper_act_cmpl_batch_flg = "is_oper_act_cmpl_batch_flg";


	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_immed_prnt_flg_META = createCommonMeta($act_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_bkf_upd_flg_META = createCommonMeta($not_bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wk_cost_upd_calc_flg_META = createCommonMeta($not_wk_cost_upd_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_io_act_srv_exec_flg_META = createCommonMeta($not_io_act_srv_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_commit_flg_META = createCommonMeta($not_commit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_oper_act_cmpl_batch_flg_META = createCommonMeta($is_oper_act_cmpl_batch_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgActReg_Upd02_CtrlR> constMetas = new ConstMetaList<MfgActReg_Upd02_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_unit_flg_META,
			act_immed_prnt_flg_META,
			not_bkf_upd_flg_META,
			not_wk_cost_upd_calc_flg_META,
			not_io_act_srv_exec_flg_META,
			is_src_batch_flg_META,
			upd_cntr_chk_flg_META,
			not_commit_flg_META,
			is_oper_act_cmpl_batch_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected MfgActReg_Upd02_CtrlR_MC_A(ConstMetaList<? extends MfgActReg_Upd02_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd02_CtrlR clone() {
		return (MfgActReg_Upd02_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd02_CtrlR createInstance() {
		return (MfgActReg_Upd02_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd02_CtrlR getValues(String... names) {
		return (MfgActReg_Upd02_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 0, $oper_unit_flg);
	}

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 0, $oper_unit_flg, value);
	}


	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public boolean act_immed_prnt_flg() {
		return getConstBoolean(offset + 1, $act_immed_prnt_flg);
	}

	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public void act_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 1, $act_immed_prnt_flg, value);
	}


	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public boolean not_bkf_upd_flg() {
		return getConstBoolean(offset + 2, $not_bkf_upd_flg);
	}

	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public void not_bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 2, $not_bkf_upd_flg, value);
	}


	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public boolean not_wk_cost_upd_calc_flg() {
		return getConstBoolean(offset + 3, $not_wk_cost_upd_calc_flg);
	}

	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public void not_wk_cost_upd_calc_flg(boolean value) {
		setConstBoolean(offset + 3, $not_wk_cost_upd_calc_flg, value);
	}


	/**
	 * GR/GI result service call not required 受払実績サービス呼び出し不要.<p>
	 *
	 */
	public boolean not_io_act_srv_exec_flg() {
		return getConstBoolean(offset + 4, $not_io_act_srv_exec_flg);
	}

	/**
	 * GR/GI result service call not required 受払実績サービス呼び出し不要.<p>
	 *
	 */
	public void not_io_act_srv_exec_flg(boolean value) {
		setConstBoolean(offset + 4, $not_io_act_srv_exec_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 5, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 5, $is_src_batch_flg, value);
	}


	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 6, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter 更新カウンタチェック.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 6, $upd_cntr_chk_flg, value);
	}


	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public boolean not_commit_flg() {
		return getConstBoolean(offset + 7, $not_commit_flg);
	}

	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public void not_commit_flg(boolean value) {
		setConstBoolean(offset + 7, $not_commit_flg, value);
	}


	/**
	 * Call from operation result completion batch 工程実績完了バッチから呼び出す.<p>
	 *
	 */
	public boolean is_oper_act_cmpl_batch_flg() {
		return getConstBoolean(offset + 8, $is_oper_act_cmpl_batch_flg);
	}

	/**
	 * Call from operation result completion batch 工程実績完了バッチから呼び出す.<p>
	 *
	 */
	public void is_oper_act_cmpl_batch_flg(boolean value) {
		setConstBoolean(offset + 8, $is_oper_act_cmpl_batch_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		if ($not_io_act_srv_exec_flg.equalsIgnoreCase(name)) {
			return not_io_act_srv_exec_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		if ($is_oper_act_cmpl_batch_flg.equalsIgnoreCase(name)) {
			return is_oper_act_cmpl_batch_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		if ($not_io_act_srv_exec_flg.equalsIgnoreCase(name)) {
			return not_io_act_srv_exec_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		if ($is_oper_act_cmpl_batch_flg.equalsIgnoreCase(name)) {
			return is_oper_act_cmpl_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		if ($not_io_act_srv_exec_flg.equalsIgnoreCase(name)) {
			not_io_act_srv_exec_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		if ($is_oper_act_cmpl_batch_flg.equalsIgnoreCase(name)) {
			is_oper_act_cmpl_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		if ($not_io_act_srv_exec_flg.equalsIgnoreCase(name)) {
			not_io_act_srv_exec_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		if ($is_oper_act_cmpl_batch_flg.equalsIgnoreCase(name)) {
			is_oper_act_cmpl_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

