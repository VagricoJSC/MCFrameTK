package mcframe.serverMAUC.MAUCL5010;

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
 * ブロック"PushNtc_Upd01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PushNtc_Upd01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Push notification master application date プッシュ通知マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
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
	 * Notify-to user cd. 通知先ユーザＣＤ.<p>
	 *
	 */
	public static final String $ntc_usr_cd = "ntc_usr_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ntc_wg_cd_META = createCommonMeta($ntc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ntc_dpt_cd_META = createCommonMeta($ntc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ntc_aprv_role_cd_META = createCommonMeta($ntc_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta ntc_usr_cd_META = createCommonMeta($ntc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);

	protected static final ConstMetaList<PushNtc_Upd01_Dtl2R> constMetas = new ConstMetaList<PushNtc_Upd01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			master_dt_META,
			ntc_wg_cd_META,
			ntc_dpt_cd_META,
			ntc_aprv_role_cd_META,
			ntc_usr_cd_META
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
	protected PushNtc_Upd01_Dtl2R_MC_A(ConstMetaList<? extends PushNtc_Upd01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl2R clone() {
		return (PushNtc_Upd01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl2R createInstance() {
		return (PushNtc_Upd01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PushNtc_Upd01_Dtl2R getValues(String... names) {
		return (PushNtc_Upd01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Push notification master application date プッシュ通知マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 1, $master_dt);
	}

	/**
	 * Push notification master application date プッシュ通知マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 1, $master_dt, value);
	}


	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public String ntc_wg_cd() {
		return getConstString(offset + 2, $ntc_wg_cd);
	}

	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public void ntc_wg_cd(String value) {
		setConstString(offset + 2, $ntc_wg_cd, value);
	}


	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public String ntc_dpt_cd() {
		return getConstString(offset + 3, $ntc_dpt_cd);
	}

	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public void ntc_dpt_cd(String value) {
		setConstString(offset + 3, $ntc_dpt_cd, value);
	}


	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public String ntc_aprv_role_cd() {
		return getConstString(offset + 4, $ntc_aprv_role_cd);
	}

	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public void ntc_aprv_role_cd(String value) {
		setConstString(offset + 4, $ntc_aprv_role_cd, value);
	}


	/**
	 * Notify-to user cd. 通知先ユーザＣＤ.<p>
	 *
	 */
	public String ntc_usr_cd() {
		return getConstString(offset + 5, $ntc_usr_cd);
	}

	/**
	 * Notify-to user cd. 通知先ユーザＣＤ.<p>
	 *
	 */
	public void ntc_usr_cd(String value) {
		setConstString(offset + 5, $ntc_usr_cd, value);
	}


	public String getString(String name) {
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			return ntc_usr_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			return ntc_usr_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
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
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			ntc_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			ntc_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

