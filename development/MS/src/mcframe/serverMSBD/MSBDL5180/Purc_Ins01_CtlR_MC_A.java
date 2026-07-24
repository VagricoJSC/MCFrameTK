package mcframe.serverMSBD.MSBDL5180;

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
 * ブロック"Purc_Ins01_Ctl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_Ins01_CtlR_MC_A extends MCConstRow {

	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public static final String $io_make_flg = "io_make_flg";
	/**
	 * Receipt result creation flg. 入荷実績作成ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_act_flg = "arr_act_flg";
	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public static final String $arr_act_srvs_flg = "arr_act_srvs_flg";
	/**
	 * Caller/direct delivery sales 呼出元・仕入直送売上.<p>
	 *
	 */
	public static final String $purc_ddlv_reg_exec_flg = "purc_ddlv_reg_exec_flg";
	/**
	 * Purchase details correction flg. 仕入明細訂正ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_dtl_flg = "purc_dtl_flg";
	/**
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public static final String $insp_act_srvs_flg = "insp_act_srvs_flg";
	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public static final String $rcpt_iv_form_flg = "rcpt_iv_form_flg";
	/**
	 * Purchase result list flg. 仕入実績一覧ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_lst_flg = "purc_lst_flg";
	/**
	 * Purchase result entry flg. 仕入実績登録ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_form_flg = "purc_form_flg";
	/**
	 * Purchase return entry flg. 仕入返品登録ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ret_flg = "purc_ret_flg";
	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public static final String $amt_calc_flg = "amt_calc_flg";


	public static final MCMeta io_make_flg_META = createCommonMeta($io_make_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_act_flg_META = createCommonMeta($arr_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_act_srvs_flg_META = createCommonMeta($arr_act_srvs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_reg_exec_flg_META = createCommonMeta($purc_ddlv_reg_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dtl_flg_META = createCommonMeta($purc_dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_act_srvs_flg_META = createCommonMeta($insp_act_srvs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_form_flg_META = createCommonMeta($rcpt_iv_form_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_lst_flg_META = createCommonMeta($purc_lst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_form_flg_META = createCommonMeta($purc_form_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ret_flg_META = createCommonMeta($purc_ret_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_calc_flg_META = createCommonMeta($amt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Purc_Ins01_CtlR> constMetas = new ConstMetaList<Purc_Ins01_CtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			io_make_flg_META,
			arr_act_flg_META,
			arr_act_srvs_flg_META,
			purc_ddlv_reg_exec_flg_META,
			purc_dtl_flg_META,
			insp_act_srvs_flg_META,
			rcpt_iv_form_flg_META,
			purc_lst_flg_META,
			purc_form_flg_META,
			purc_ret_flg_META,
			amt_calc_flg_META
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
	protected Purc_Ins01_CtlR_MC_A(ConstMetaList<? extends Purc_Ins01_CtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Ins01_CtlR clone() {
		return (Purc_Ins01_CtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Ins01_CtlR createInstance() {
		return (Purc_Ins01_CtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Ins01_CtlR getValues(String... names) {
		return (Purc_Ins01_CtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean io_make_flg() {
		return getConstBoolean(offset + 0, $io_make_flg);
	}

	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public void io_make_flg(boolean value) {
		setConstBoolean(offset + 0, $io_make_flg, value);
	}


	/**
	 * Receipt result creation flg. 入荷実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean arr_act_flg() {
		return getConstBoolean(offset + 1, $arr_act_flg);
	}

	/**
	 * Receipt result creation flg. 入荷実績作成ＦＬＧ.<p>
	 *
	 */
	public void arr_act_flg(boolean value) {
		setConstBoolean(offset + 1, $arr_act_flg, value);
	}


	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public boolean arr_act_srvs_flg() {
		return getConstBoolean(offset + 2, $arr_act_srvs_flg);
	}

	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public void arr_act_srvs_flg(boolean value) {
		setConstBoolean(offset + 2, $arr_act_srvs_flg, value);
	}


	/**
	 * Caller/direct delivery sales 呼出元・仕入直送売上.<p>
	 *
	 */
	public boolean purc_ddlv_reg_exec_flg() {
		return getConstBoolean(offset + 3, $purc_ddlv_reg_exec_flg);
	}

	/**
	 * Caller/direct delivery sales 呼出元・仕入直送売上.<p>
	 *
	 */
	public void purc_ddlv_reg_exec_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_ddlv_reg_exec_flg, value);
	}


	/**
	 * Purchase details correction flg. 仕入明細訂正ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dtl_flg() {
		return getConstBoolean(offset + 4, $purc_dtl_flg);
	}

	/**
	 * Purchase details correction flg. 仕入明細訂正ＦＬＧ.<p>
	 *
	 */
	public void purc_dtl_flg(boolean value) {
		setConstBoolean(offset + 4, $purc_dtl_flg, value);
	}


	/**
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public boolean insp_act_srvs_flg() {
		return getConstBoolean(offset + 5, $insp_act_srvs_flg);
	}

	/**
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public void insp_act_srvs_flg(boolean value) {
		setConstBoolean(offset + 5, $insp_act_srvs_flg, value);
	}


	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public boolean rcpt_iv_form_flg() {
		return getConstBoolean(offset + 6, $rcpt_iv_form_flg);
	}

	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public void rcpt_iv_form_flg(boolean value) {
		setConstBoolean(offset + 6, $rcpt_iv_form_flg, value);
	}


	/**
	 * Purchase result list flg. 仕入実績一覧ＦＬＧ.<p>
	 *
	 */
	public boolean purc_lst_flg() {
		return getConstBoolean(offset + 7, $purc_lst_flg);
	}

	/**
	 * Purchase result list flg. 仕入実績一覧ＦＬＧ.<p>
	 *
	 */
	public void purc_lst_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_lst_flg, value);
	}


	/**
	 * Purchase result entry flg. 仕入実績登録ＦＬＧ.<p>
	 *
	 */
	public boolean purc_form_flg() {
		return getConstBoolean(offset + 8, $purc_form_flg);
	}

	/**
	 * Purchase result entry flg. 仕入実績登録ＦＬＧ.<p>
	 *
	 */
	public void purc_form_flg(boolean value) {
		setConstBoolean(offset + 8, $purc_form_flg, value);
	}


	/**
	 * Purchase return entry flg. 仕入返品登録ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ret_flg() {
		return getConstBoolean(offset + 9, $purc_ret_flg);
	}

	/**
	 * Purchase return entry flg. 仕入返品登録ＦＬＧ.<p>
	 *
	 */
	public void purc_ret_flg(boolean value) {
		setConstBoolean(offset + 9, $purc_ret_flg, value);
	}


	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public boolean amt_calc_flg() {
		return getConstBoolean(offset + 10, $amt_calc_flg);
	}

	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public void amt_calc_flg(boolean value) {
		setConstBoolean(offset + 10, $amt_calc_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($arr_act_srvs_flg.equalsIgnoreCase(name)) {
			return arr_act_srvs_flg();
		}
		if ($purc_ddlv_reg_exec_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_reg_exec_flg();
		}
		if ($purc_dtl_flg.equalsIgnoreCase(name)) {
			return purc_dtl_flg();
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			return insp_act_srvs_flg();
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_form_flg();
		}
		if ($purc_lst_flg.equalsIgnoreCase(name)) {
			return purc_lst_flg();
		}
		if ($purc_form_flg.equalsIgnoreCase(name)) {
			return purc_form_flg();
		}
		if ($purc_ret_flg.equalsIgnoreCase(name)) {
			return purc_ret_flg();
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			return amt_calc_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($arr_act_srvs_flg.equalsIgnoreCase(name)) {
			return arr_act_srvs_flg();
		}
		if ($purc_ddlv_reg_exec_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_reg_exec_flg();
		}
		if ($purc_dtl_flg.equalsIgnoreCase(name)) {
			return purc_dtl_flg();
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			return insp_act_srvs_flg();
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_form_flg();
		}
		if ($purc_lst_flg.equalsIgnoreCase(name)) {
			return purc_lst_flg();
		}
		if ($purc_form_flg.equalsIgnoreCase(name)) {
			return purc_form_flg();
		}
		if ($purc_ret_flg.equalsIgnoreCase(name)) {
			return purc_ret_flg();
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			return amt_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
			return;
		}
		if ($arr_act_srvs_flg.equalsIgnoreCase(name)) {
			arr_act_srvs_flg(value);
			return;
		}
		if ($purc_ddlv_reg_exec_flg.equalsIgnoreCase(name)) {
			purc_ddlv_reg_exec_flg(value);
			return;
		}
		if ($purc_dtl_flg.equalsIgnoreCase(name)) {
			purc_dtl_flg(value);
			return;
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			insp_act_srvs_flg(value);
			return;
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			rcpt_iv_form_flg(value);
			return;
		}
		if ($purc_lst_flg.equalsIgnoreCase(name)) {
			purc_lst_flg(value);
			return;
		}
		if ($purc_form_flg.equalsIgnoreCase(name)) {
			purc_form_flg(value);
			return;
		}
		if ($purc_ret_flg.equalsIgnoreCase(name)) {
			purc_ret_flg(value);
			return;
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			amt_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
			return;
		}
		if ($arr_act_srvs_flg.equalsIgnoreCase(name)) {
			arr_act_srvs_flg(value);
			return;
		}
		if ($purc_ddlv_reg_exec_flg.equalsIgnoreCase(name)) {
			purc_ddlv_reg_exec_flg(value);
			return;
		}
		if ($purc_dtl_flg.equalsIgnoreCase(name)) {
			purc_dtl_flg(value);
			return;
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			insp_act_srvs_flg(value);
			return;
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			rcpt_iv_form_flg(value);
			return;
		}
		if ($purc_lst_flg.equalsIgnoreCase(name)) {
			purc_lst_flg(value);
			return;
		}
		if ($purc_form_flg.equalsIgnoreCase(name)) {
			purc_form_flg(value);
			return;
		}
		if ($purc_ret_flg.equalsIgnoreCase(name)) {
			purc_ret_flg(value);
			return;
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			amt_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

