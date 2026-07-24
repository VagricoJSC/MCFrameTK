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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_dt_fr = "st_dt_fr";
	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public static final String $st_dt_to = "st_dt_to";
	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_dt_fr = "end_dt_fr";
	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public static final String $end_dt_to = "end_dt_to";
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
	 * Notify-to WG name 通知先ワーキンググループ名.<p>
	 *
	 */
	public static final String $ntc_wg_nm = "ntc_wg_nm";
	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public static final String $ntc_dpt_cd = "ntc_dpt_cd";
	/**
	 * Notify-to dept. name 通知先部門名.<p>
	 *
	 */
	public static final String $ntc_dpt_nm = "ntc_dpt_nm";
	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public static final String $ntc_aprv_role_cd = "ntc_aprv_role_cd";
	/**
	 * Notify-to approval role name 通知先承認役割名.<p>
	 *
	 */
	public static final String $ntc_aprv_role_nm = "ntc_aprv_role_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";


	public static final MCMeta st_dt_fr_META = createCommonMeta($st_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_dt_to_META = createCommonMeta($st_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_fr_META = createCommonMeta($end_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_to_META = createCommonMeta($end_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta push_ntc_typ_META = createCommonMeta($push_ntc_typ, mcframe.commonMA.meta.MA_META.PUSH_NTC_TYP);
	public static final MCMeta ntc_wg_cd_META = createCommonMeta($ntc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ntc_wg_nm_META = createCommonMeta($ntc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ntc_dpt_cd_META = createCommonMeta($ntc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ntc_dpt_nm_META = createCommonMeta($ntc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ntc_aprv_role_cd_META = createCommonMeta($ntc_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta ntc_aprv_role_nm_META = createCommonMeta($ntc_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_fr_META,
			st_dt_to_META,
			end_dt_fr_META,
			end_dt_to_META,
			push_ntc_typ_META,
			ntc_wg_cd_META,
			ntc_wg_nm_META,
			ntc_dpt_cd_META,
			ntc_dpt_nm_META,
			ntc_aprv_role_cd_META,
			ntc_aprv_role_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_dt_fr() {
		return getConstDate(offset + 0, $st_dt_fr);
	}

	/**
	 * Application start date FROM 適用開始日ＦＲＯＭ.<p>
	 *
	 */
	public void st_dt_fr(MCDate value) {
		setConstDate(offset + 0, $st_dt_fr, value);
	}


	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public MCDate st_dt_to() {
		return getConstDate(offset + 1, $st_dt_to);
	}

	/**
	 * Application start date TO 適用開始日ＴＯ.<p>
	 *
	 */
	public void st_dt_to(MCDate value) {
		setConstDate(offset + 1, $st_dt_to, value);
	}


	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_dt_fr() {
		return getConstDate(offset + 2, $end_dt_fr);
	}

	/**
	 * Application end date FROM 適用終了日ＦＲＯＭ.<p>
	 *
	 */
	public void end_dt_fr(MCDate value) {
		setConstDate(offset + 2, $end_dt_fr, value);
	}


	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public MCDate end_dt_to() {
		return getConstDate(offset + 3, $end_dt_to);
	}

	/**
	 * Application end date TO 適用終了日ＴＯ.<p>
	 *
	 */
	public void end_dt_to(MCDate value) {
		setConstDate(offset + 3, $end_dt_to, value);
	}


	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public String push_ntc_typ() {
		return getConstString(offset + 4, $push_ntc_typ);
	}

	/**
	 * Push notification type プッシュ通知区分.<p>
	 *
	 */
	public void push_ntc_typ(String value) {
		setConstString(offset + 4, $push_ntc_typ, value);
	}


	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public String ntc_wg_cd() {
		return getConstString(offset + 5, $ntc_wg_cd);
	}

	/**
	 * Notify-to WG cd. 通知先ワーキンググループＣＤ.<p>
	 *
	 */
	public void ntc_wg_cd(String value) {
		setConstString(offset + 5, $ntc_wg_cd, value);
	}


	/**
	 * Notify-to WG name 通知先ワーキンググループ名.<p>
	 *
	 */
	public String ntc_wg_nm() {
		return getConstString(offset + 6, $ntc_wg_nm);
	}

	/**
	 * Notify-to WG name 通知先ワーキンググループ名.<p>
	 *
	 */
	public void ntc_wg_nm(String value) {
		setConstString(offset + 6, $ntc_wg_nm, value);
	}


	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public String ntc_dpt_cd() {
		return getConstString(offset + 7, $ntc_dpt_cd);
	}

	/**
	 * Notify-to dept. cd. 通知先部門ＣＤ.<p>
	 *
	 */
	public void ntc_dpt_cd(String value) {
		setConstString(offset + 7, $ntc_dpt_cd, value);
	}


	/**
	 * Notify-to dept. name 通知先部門名.<p>
	 *
	 */
	public String ntc_dpt_nm() {
		return getConstString(offset + 8, $ntc_dpt_nm);
	}

	/**
	 * Notify-to dept. name 通知先部門名.<p>
	 *
	 */
	public void ntc_dpt_nm(String value) {
		setConstString(offset + 8, $ntc_dpt_nm, value);
	}


	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public String ntc_aprv_role_cd() {
		return getConstString(offset + 9, $ntc_aprv_role_cd);
	}

	/**
	 * Notify-to approval role cd. 通知先承認役割ＣＤ.<p>
	 *
	 */
	public void ntc_aprv_role_cd(String value) {
		setConstString(offset + 9, $ntc_aprv_role_cd, value);
	}


	/**
	 * Notify-to approval role name 通知先承認役割名.<p>
	 *
	 */
	public String ntc_aprv_role_nm() {
		return getConstString(offset + 10, $ntc_aprv_role_nm);
	}

	/**
	 * Notify-to approval role name 通知先承認役割名.<p>
	 *
	 */
	public void ntc_aprv_role_nm(String value) {
		setConstString(offset + 10, $ntc_aprv_role_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 11, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 11, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 12, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 12, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 13, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 13, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 14, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 14, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 15, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 15, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_wg_nm.equalsIgnoreCase(name)) {
			return ntc_wg_nm();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_dpt_nm.equalsIgnoreCase(name)) {
			return ntc_dpt_nm();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_aprv_role_nm.equalsIgnoreCase(name)) {
			return ntc_aprv_role_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_wg_nm.equalsIgnoreCase(name)) {
			return ntc_wg_nm();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_dpt_nm.equalsIgnoreCase(name)) {
			return ntc_dpt_nm();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_aprv_role_nm.equalsIgnoreCase(name)) {
			return ntc_aprv_role_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			return st_dt_fr();
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			return st_dt_to();
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			return end_dt_fr();
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			return end_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
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
		if ($ntc_wg_nm.equalsIgnoreCase(name)) {
			ntc_wg_nm(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_dpt_nm.equalsIgnoreCase(name)) {
			ntc_dpt_nm(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		if ($ntc_aprv_role_nm.equalsIgnoreCase(name)) {
			ntc_aprv_role_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($ntc_wg_nm.equalsIgnoreCase(name)) {
			ntc_wg_nm(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_dpt_nm.equalsIgnoreCase(name)) {
			ntc_dpt_nm(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		if ($ntc_aprv_role_nm.equalsIgnoreCase(name)) {
			ntc_aprv_role_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_fr.equalsIgnoreCase(name)) {
			st_dt_fr(value);
			return;
		}
		if ($st_dt_to.equalsIgnoreCase(name)) {
			st_dt_to(value);
			return;
		}
		if ($end_dt_fr.equalsIgnoreCase(name)) {
			end_dt_fr(value);
			return;
		}
		if ($end_dt_to.equalsIgnoreCase(name)) {
			end_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

