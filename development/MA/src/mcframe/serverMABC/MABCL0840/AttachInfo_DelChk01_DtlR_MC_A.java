package mcframe.serverMABC.MABCL0840;

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
 * ブロック"AttachInfo_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AttachInfo_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public static final String $attach_info_typ = "attach_info_typ";
	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public static final String $attach_info_key1 = "attach_info_key1";
	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public static final String $attach_info_key2 = "attach_info_key2";
	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public static final String $attach_info_key3 = "attach_info_key3";
	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public static final String $attach_info_key4 = "attach_info_key4";
	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public static final String $attach_info_key5 = "attach_info_key5";
	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public static final String $attach_info_id = "attach_info_id";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta attach_info_typ_META = createCommonMeta($attach_info_typ, mcframe.commonMA.meta.MA_META.ATTACH_INFO_TYP);
	public static final MCMeta attach_info_key1_META = createCommonMeta($attach_info_key1, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY1);
	public static final MCMeta attach_info_key2_META = createCommonMeta($attach_info_key2, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY2);
	public static final MCMeta attach_info_key3_META = createCommonMeta($attach_info_key3, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY3);
	public static final MCMeta attach_info_key4_META = createCommonMeta($attach_info_key4, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY4);
	public static final MCMeta attach_info_key5_META = createCommonMeta($attach_info_key5, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY5);
	public static final MCMeta attach_info_id_META = createCommonMeta($attach_info_id, mcframe.commonMA.meta.MA_META.ATTACH_INFO_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<AttachInfo_DelChk01_DtlR> constMetas = new ConstMetaList<AttachInfo_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wg_cd_META,
			attach_info_typ_META,
			attach_info_key1_META,
			attach_info_key2_META,
			attach_info_key3_META,
			attach_info_key4_META,
			attach_info_key5_META,
			attach_info_id_META,
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
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$wg_cd, "E"},	// wg_cd
				{$attach_info_typ, "E"},	// attach_info_typ
				{$attach_info_id, "E"}	// attach_info_id
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
	protected AttachInfo_DelChk01_DtlR_MC_A(ConstMetaList<? extends AttachInfo_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachInfo_DelChk01_DtlR clone() {
		return (AttachInfo_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachInfo_DelChk01_DtlR createInstance() {
		return (AttachInfo_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachInfo_DelChk01_DtlR getValues(String... names) {
		return (AttachInfo_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 4, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 4, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 5, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 5, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 6, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 6, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 7, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 7, $sno4, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public String attach_info_typ() {
		return getConstString(offset + 9, $attach_info_typ);
	}

	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public void attach_info_typ(String value) {
		setConstString(offset + 9, $attach_info_typ, value);
	}


	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public String attach_info_key1() {
		return getConstString(offset + 10, $attach_info_key1);
	}

	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public void attach_info_key1(String value) {
		setConstString(offset + 10, $attach_info_key1, value);
	}


	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public String attach_info_key2() {
		return getConstString(offset + 11, $attach_info_key2);
	}

	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public void attach_info_key2(String value) {
		setConstString(offset + 11, $attach_info_key2, value);
	}


	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public String attach_info_key3() {
		return getConstString(offset + 12, $attach_info_key3);
	}

	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public void attach_info_key3(String value) {
		setConstString(offset + 12, $attach_info_key3, value);
	}


	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public String attach_info_key4() {
		return getConstString(offset + 13, $attach_info_key4);
	}

	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public void attach_info_key4(String value) {
		setConstString(offset + 13, $attach_info_key4, value);
	}


	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public String attach_info_key5() {
		return getConstString(offset + 14, $attach_info_key5);
	}

	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public void attach_info_key5(String value) {
		setConstString(offset + 14, $attach_info_key5, value);
	}


	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public String attach_info_id() {
		return getConstString(offset + 15, $attach_info_id);
	}

	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public void attach_info_id(String value) {
		setConstString(offset + 15, $attach_info_id, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 16, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 16, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 16, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 16, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 16, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 16, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
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

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
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



}

