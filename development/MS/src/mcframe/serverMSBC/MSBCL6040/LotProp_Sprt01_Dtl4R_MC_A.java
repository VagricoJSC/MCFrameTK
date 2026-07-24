package mcframe.serverMSBC.MSBCL6040;

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
 * ブロック"LotProp_Sprt01_Dtl4"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotProp_Sprt01_Dtl4R_MC_A extends MCConstRow {

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $inpt_peg_no = "inpt_peg_no";
	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public static final String $loss_peg_no = "loss_peg_no";
	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public static final String $fxd_loss_flg = "fxd_loss_flg";
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $loss_rsn_cd = "loss_rsn_cd";
	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public static final String $loss_qty = "loss_qty";
	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public static final String $cont_loss_qty = "cont_loss_qty";
	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";


	public static final MCMeta inpt_peg_no_META = createCommonMeta($inpt_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta loss_peg_no_META = createCommonMeta($loss_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_qty_META = createCommonMeta($loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_loss_qty_META = createCommonMeta($cont_loss_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LotProp_Sprt01_Dtl4R> constMetas = new ConstMetaList<LotProp_Sprt01_Dtl4R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_peg_no_META,
			loss_peg_no_META,
			fxd_loss_flg_META,
			loss_rsn_cd_META,
			loss_qty_META,
			cont_loss_qty_META,
			add_flg_META
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
	protected LotProp_Sprt01_Dtl4R_MC_A(ConstMetaList<? extends LotProp_Sprt01_Dtl4R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl4R clone() {
		return (LotProp_Sprt01_Dtl4R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl4R createInstance() {
		return (LotProp_Sprt01_Dtl4R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotProp_Sprt01_Dtl4R getValues(String... names) {
		return (LotProp_Sprt01_Dtl4R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inpt_peg_no() {
		return getConstNumber(offset + 0, $inpt_peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(int value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(long value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(float value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void inpt_peg_no(double value) {
		setConstNumber(offset + 0, $inpt_peg_no, value);
	}


	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber loss_peg_no() {
		return getConstNumber(offset + 1, $loss_peg_no);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(int value) {
		setConstNumber(offset + 1, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(long value) {
		setConstNumber(offset + 1, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(float value) {
		setConstNumber(offset + 1, $loss_peg_no, value);
	}

	/**
	 * Loss result pegging No. ロス実績用紐付けＮＯ.<p>
	 *
	 */
	public void loss_peg_no(double value) {
		setConstNumber(offset + 1, $loss_peg_no, value);
	}


	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 2, $fxd_loss_flg);
	}

	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 2, $fxd_loss_flg, value);
	}


	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 3, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 3, $loss_rsn_cd, value);
	}


	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return getConstNumber(offset + 4, $loss_qty);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		setConstNumber(offset + 4, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		setConstNumber(offset + 4, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		setConstNumber(offset + 4, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		setConstNumber(offset + 4, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		setConstNumber(offset + 4, $loss_qty, value);
	}


	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return getConstNumber(offset + 5, $cont_loss_qty);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		setConstNumber(offset + 5, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		setConstNumber(offset + 5, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		setConstNumber(offset + 5, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		setConstNumber(offset + 5, $cont_loss_qty, value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		setConstNumber(offset + 5, $cont_loss_qty, value);
	}


	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 6, $add_flg);
	}

	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 6, $add_flg, value);
	}


	public String getString(String name) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			return loss_peg_no();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			return inpt_peg_no();
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			return loss_peg_no();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			return cont_loss_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($inpt_peg_no.equalsIgnoreCase(name)) {
			inpt_peg_no(value);
			return;
		}
		if ($loss_peg_no.equalsIgnoreCase(name)) {
			loss_peg_no(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($cont_loss_qty.equalsIgnoreCase(name)) {
			cont_loss_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

