package mcframe.serverMABC.MABCL0150;

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
 * ブロック"PushNtc_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PushNtc_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public static final String $push_ntc_typ = "push_ntc_typ";
	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $ntc_wg_cd = "ntc_wg_cd";
	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public static final String $ntc_dpt_cd = "ntc_dpt_cd";
	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public static final String $ntc_aprv_role_cd = "ntc_aprv_role_cd";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta push_ntc_typ_META = createCommonMeta($push_ntc_typ, mcframe.commonMA.meta.MA_META.PUSH_NTC_TYP);
	public static final MCMeta ntc_wg_cd_META = createCommonMeta($ntc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ntc_dpt_cd_META = createCommonMeta($ntc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ntc_aprv_role_cd_META = createCommonMeta($ntc_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<PushNtc_DelChk01_DtlR> constMetas = new ConstMetaList<PushNtc_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			push_ntc_typ_META,
			ntc_wg_cd_META,
			ntc_dpt_cd_META,
			ntc_aprv_role_cd_META,
			st_dt_META,
			upd_cntr_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$push_ntc_typ, "E"},	// push_ntc_typ
				{$st_dt, "E"}	// st_dt
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
	protected PushNtc_DelChk01_DtlR_MC_A(ConstMetaList<? extends PushNtc_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_DelChk01_DtlR clone() {
		return (PushNtc_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_DelChk01_DtlR createInstance() {
		return (PushNtc_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_DelChk01_DtlR getValues(String... names) {
		return (PushNtc_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public String push_ntc_typ() {
		return getConstString(offset + 0, $push_ntc_typ);
	}

	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public void push_ntc_typ(String value) {
		setConstString(offset + 0, $push_ntc_typ, value);
	}


	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public String ntc_wg_cd() {
		return getConstString(offset + 1, $ntc_wg_cd);
	}

	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public void ntc_wg_cd(String value) {
		setConstString(offset + 1, $ntc_wg_cd, value);
	}


	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public String ntc_dpt_cd() {
		return getConstString(offset + 2, $ntc_dpt_cd);
	}

	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public void ntc_dpt_cd(String value) {
		setConstString(offset + 2, $ntc_dpt_cd, value);
	}


	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public String ntc_aprv_role_cd() {
		return getConstString(offset + 3, $ntc_aprv_role_cd);
	}

	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public void ntc_aprv_role_cd(String value) {
		setConstString(offset + 3, $ntc_aprv_role_cd, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 4, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 4, $st_dt, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 5, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			ntc_wg_cd(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			ntc_wg_cd(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

