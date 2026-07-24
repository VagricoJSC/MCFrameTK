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
 * ブロック"Purc_Chk03_Ctl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_Chk03_CtlR_MC_A extends MCConstRow {

	/**
	 * Message cache creation flg. 電文キャッシュ作成ＦＬＧ.<p>
	 *
	 */
	public static final String $crt_param_cache_flg = "crt_param_cache_flg";
	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public static final String $arr_act_srvs_flg = "arr_act_srvs_flg";
	/**
	 * Caller/direct delivery sales flg. 呼出元・仕入直送売上ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_reg_exec_flg = "purc_ddlv_reg_exec_flg";
	/**
	 * Caller/purchase result details correction flg. 呼出元・仕入実績明細訂正ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_dtl_flg = "purc_dtl_flg";
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
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public static final String $insp_act_srvs_flg = "insp_act_srvs_flg";
	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public static final String $rcpt_iv_form_flg = "rcpt_iv_form_flg";


	public static final MCMeta crt_param_cache_flg_META = createCommonMeta($crt_param_cache_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_act_srvs_flg_META = createCommonMeta($arr_act_srvs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_reg_exec_flg_META = createCommonMeta($purc_ddlv_reg_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dtl_flg_META = createCommonMeta($purc_dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_make_flg_META = createCommonMeta($io_make_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_act_flg_META = createCommonMeta($arr_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_act_srvs_flg_META = createCommonMeta($insp_act_srvs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_form_flg_META = createCommonMeta($rcpt_iv_form_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Purc_Chk03_CtlR> constMetas = new ConstMetaList<Purc_Chk03_CtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			crt_param_cache_flg_META,
			arr_act_srvs_flg_META,
			purc_ddlv_reg_exec_flg_META,
			purc_dtl_flg_META,
			io_make_flg_META,
			arr_act_flg_META,
			insp_act_srvs_flg_META,
			rcpt_iv_form_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		))
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
	protected Purc_Chk03_CtlR_MC_A(ConstMetaList<? extends Purc_Chk03_CtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_CtlR clone() {
		return (Purc_Chk03_CtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_CtlR createInstance() {
		return (Purc_Chk03_CtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_Chk03_CtlR getValues(String... names) {
		return (Purc_Chk03_CtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Message cache creation flg. 電文キャッシュ作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_param_cache_flg() {
		return getConstBoolean(offset + 0, $crt_param_cache_flg);
	}

	/**
	 * Message cache creation flg. 電文キャッシュ作成ＦＬＧ.<p>
	 *
	 */
	public void crt_param_cache_flg(boolean value) {
		setConstBoolean(offset + 0, $crt_param_cache_flg, value);
	}


	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public boolean arr_act_srvs_flg() {
		return getConstBoolean(offset + 1, $arr_act_srvs_flg);
	}

	/**
	 * Caller/receipt result service flg. 呼出元・入荷実績サービスＦＬＧ.<p>
	 *
	 */
	public void arr_act_srvs_flg(boolean value) {
		setConstBoolean(offset + 1, $arr_act_srvs_flg, value);
	}


	/**
	 * Caller/direct delivery sales flg. 呼出元・仕入直送売上ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_reg_exec_flg() {
		return getConstBoolean(offset + 2, $purc_ddlv_reg_exec_flg);
	}

	/**
	 * Caller/direct delivery sales flg. 呼出元・仕入直送売上ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_reg_exec_flg(boolean value) {
		setConstBoolean(offset + 2, $purc_ddlv_reg_exec_flg, value);
	}


	/**
	 * Caller/purchase result details correction flg. 呼出元・仕入実績明細訂正ＦＬＧ.<p>
	 *
	 */
	public boolean purc_dtl_flg() {
		return getConstBoolean(offset + 3, $purc_dtl_flg);
	}

	/**
	 * Caller/purchase result details correction flg. 呼出元・仕入実績明細訂正ＦＬＧ.<p>
	 *
	 */
	public void purc_dtl_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_dtl_flg, value);
	}


	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean io_make_flg() {
		return getConstBoolean(offset + 4, $io_make_flg);
	}

	/**
	 * GR/GI result creation flg. 受払実績作成ＦＬＧ.<p>
	 *
	 */
	public void io_make_flg(boolean value) {
		setConstBoolean(offset + 4, $io_make_flg, value);
	}


	/**
	 * Receipt result creation flg. 入荷実績作成ＦＬＧ.<p>
	 *
	 */
	public boolean arr_act_flg() {
		return getConstBoolean(offset + 5, $arr_act_flg);
	}

	/**
	 * Receipt result creation flg. 入荷実績作成ＦＬＧ.<p>
	 *
	 */
	public void arr_act_flg(boolean value) {
		setConstBoolean(offset + 5, $arr_act_flg, value);
	}


	/**
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public boolean insp_act_srvs_flg() {
		return getConstBoolean(offset + 6, $insp_act_srvs_flg);
	}

	/**
	 * Caller/inspection result service flg. 呼出元・検査実績サービスＦＬＧ.<p>
	 *
	 */
	public void insp_act_srvs_flg(boolean value) {
		setConstBoolean(offset + 6, $insp_act_srvs_flg, value);
	}


	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public boolean rcpt_iv_form_flg() {
		return getConstBoolean(offset + 7, $rcpt_iv_form_flg);
	}

	/**
	 * Caller / Purchase invoice entry flg. 呼出元・受領インボイス登録ＦＬＧ.<p>
	 *
	 */
	public void rcpt_iv_form_flg(boolean value) {
		setConstBoolean(offset + 7, $rcpt_iv_form_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($crt_param_cache_flg.equalsIgnoreCase(name)) {
			return crt_param_cache_flg();
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
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			return insp_act_srvs_flg();
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_form_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($crt_param_cache_flg.equalsIgnoreCase(name)) {
			return crt_param_cache_flg();
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
		if ($io_make_flg.equalsIgnoreCase(name)) {
			return io_make_flg();
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			return arr_act_flg();
		}
		if ($insp_act_srvs_flg.equalsIgnoreCase(name)) {
			return insp_act_srvs_flg();
		}
		if ($rcpt_iv_form_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_form_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($crt_param_cache_flg.equalsIgnoreCase(name)) {
			crt_param_cache_flg(value);
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
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($crt_param_cache_flg.equalsIgnoreCase(name)) {
			crt_param_cache_flg(value);
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
		if ($io_make_flg.equalsIgnoreCase(name)) {
			io_make_flg(value);
			return;
		}
		if ($arr_act_flg.equalsIgnoreCase(name)) {
			arr_act_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

