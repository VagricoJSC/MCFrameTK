package mcframe.serverMABS.MABSL0130;

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
 * ブロック"ProvUpri_Aprv_UpdChk01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ProvUpri_Aprv_UpdChk01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Application date 申請日.<p>
	 *
	 */
	public static final String $apl_dt = "apl_dt";
	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public static final String $apl_no = "apl_no";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $apl_usr_cd = "apl_usr_cd";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $apl_dpt_cd = "apl_dpt_cd";
	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public static final String $mst_apl_memo = "mst_apl_memo";


	public static final MCMeta apl_dt_META = createCommonMeta($apl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta apl_no_META = createCommonMeta($apl_no, mcframe.commonMA.meta.MA_META.APL_NO);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta apl_usr_cd_META = createCommonMeta($apl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta apl_dpt_cd_META = createCommonMeta($apl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mst_apl_memo_META = createCommonMeta($mst_apl_memo, mcframe.commonMA.meta.MA_META.MST_APL_MEMO);

	protected static final ConstMetaList<ProvUpri_Aprv_UpdChk01_Dtl2R> constMetas = new ConstMetaList<ProvUpri_Aprv_UpdChk01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			apl_dt_META,
			apl_no_META,
			aprv_no_META,
			apl_usr_cd_META,
			apl_dpt_cd_META,
			mst_apl_memo_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$apl_dt, "U"},	// apl_dt
				{$apl_usr_cd, "U"},	// apl_usr_cd
				{$apl_dpt_cd, "U"}	// apl_dpt_cd
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
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
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
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
	protected ProvUpri_Aprv_UpdChk01_Dtl2R_MC_A(ConstMetaList<? extends ProvUpri_Aprv_UpdChk01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ProvUpri_Aprv_UpdChk01_Dtl2R clone() {
		return (ProvUpri_Aprv_UpdChk01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ProvUpri_Aprv_UpdChk01_Dtl2R createInstance() {
		return (ProvUpri_Aprv_UpdChk01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ProvUpri_Aprv_UpdChk01_Dtl2R getValues(String... names) {
		return (ProvUpri_Aprv_UpdChk01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application date 申請日.<p>
	 *
	 */
	public MCDate apl_dt() {
		return getConstDate(offset + 0, $apl_dt);
	}

	/**
	 * Application date 申請日.<p>
	 *
	 */
	public void apl_dt(MCDate value) {
		setConstDate(offset + 0, $apl_dt, value);
	}


	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public String apl_no() {
		return getConstString(offset + 1, $apl_no);
	}

	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public void apl_no(String value) {
		setConstString(offset + 1, $apl_no, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 2, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 2, $aprv_no, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String apl_usr_cd() {
		return getConstString(offset + 3, $apl_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void apl_usr_cd(String value) {
		setConstString(offset + 3, $apl_usr_cd, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String apl_dpt_cd() {
		return getConstString(offset + 4, $apl_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void apl_dpt_cd(String value) {
		setConstString(offset + 4, $apl_dpt_cd, value);
	}


	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public String mst_apl_memo() {
		return getConstString(offset + 5, $mst_apl_memo);
	}

	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public void mst_apl_memo(String value) {
		setConstString(offset + 5, $mst_apl_memo, value);
	}


	public String getString(String name) {
		if ($apl_no.equalsIgnoreCase(name)) {
			return apl_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($apl_usr_cd.equalsIgnoreCase(name)) {
			return apl_usr_cd();
		}
		if ($apl_dpt_cd.equalsIgnoreCase(name)) {
			return apl_dpt_cd();
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			return mst_apl_memo();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			return apl_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($apl_no.equalsIgnoreCase(name)) {
			return apl_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($apl_usr_cd.equalsIgnoreCase(name)) {
			return apl_usr_cd();
		}
		if ($apl_dpt_cd.equalsIgnoreCase(name)) {
			return apl_dpt_cd();
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			return mst_apl_memo();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			return apl_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($apl_no.equalsIgnoreCase(name)) {
			apl_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($apl_usr_cd.equalsIgnoreCase(name)) {
			apl_usr_cd(value);
			return;
		}
		if ($apl_dpt_cd.equalsIgnoreCase(name)) {
			apl_dpt_cd(value);
			return;
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			mst_apl_memo(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			apl_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($apl_no.equalsIgnoreCase(name)) {
			apl_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($apl_usr_cd.equalsIgnoreCase(name)) {
			apl_usr_cd(value);
			return;
		}
		if ($apl_dpt_cd.equalsIgnoreCase(name)) {
			apl_dpt_cd(value);
			return;
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			mst_apl_memo(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			apl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

