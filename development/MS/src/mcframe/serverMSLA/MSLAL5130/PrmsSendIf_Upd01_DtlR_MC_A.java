package mcframe.serverMSLA.MSLAL5130;

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
 * ブロック"PrmsSendIf_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PrmsSendIf_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public static final String $del_prms_rev = "del_prms_rev";


	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta del_prms_rev_META = createCommonMeta($del_prms_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final ConstMetaList<PrmsSendIf_Upd01_DtlR> constMetas = new ConstMetaList<PrmsSendIf_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_d_no_META,
			data_crud_typ_META,
			del_prms_rev_META
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
	protected PrmsSendIf_Upd01_DtlR_MC_A(ConstMetaList<? extends PrmsSendIf_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrmsSendIf_Upd01_DtlR clone() {
		return (PrmsSendIf_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrmsSendIf_Upd01_DtlR createInstance() {
		return (PrmsSendIf_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrmsSendIf_Upd01_DtlR getValues(String... names) {
		return (PrmsSendIf_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 0, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 0, $slo_d_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public MCNumber del_prms_rev() {
		return getConstNumber(offset + 2, $del_prms_rev);
	}

	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public void del_prms_rev(MCNumber value) {
		setConstNumber(offset + 2, $del_prms_rev, value);
	}

	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public void del_prms_rev(int value) {
		setConstNumber(offset + 2, $del_prms_rev, value);
	}

	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public void del_prms_rev(long value) {
		setConstNumber(offset + 2, $del_prms_rev, value);
	}

	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public void del_prms_rev(float value) {
		setConstNumber(offset + 2, $del_prms_rev, value);
	}

	/**
	 * Rev. No. at deletion 削除時改訂番号.<p>
	 *
	 */
	public void del_prms_rev(double value) {
		setConstNumber(offset + 2, $del_prms_rev, value);
	}


	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			return del_prms_rev();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			return del_prms_rev();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($del_prms_rev.equalsIgnoreCase(name)) {
			del_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

