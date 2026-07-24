package mcframe.serverMABS.MABSL0030;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABSL_BomLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_BomLst_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_BomLst.Bom_UpdChk01 aBom_UpdChk01;

	protected void initBom_UpdChk01() {
		this.info = PDef.MA_MABSL0030_Bom_UpdChk01_INFO;
		this.aBom_UpdChk01 = ((MABSL_BomLst)this).new Bom_UpdChk01();
	}

	public static MABSL_BomLst.Bom_UpdChk01 crtBom_UpdChk01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initBom_UpdChk01();
		return lgc.aBom_UpdChk01;
	}

	protected void paramBom_UpdChk01(MCParam p) {
		if (this.aBom_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBom_UpdChk01.up0());
	}

	protected void doBom_UpdChk01() {
		aBom_UpdChk01.call();
	};

	/**
	 * Bom_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createBom_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
	}

	/**
	 * Bom_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createBom_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
	}
	protected MABSL_BomLst.Bom_Upd01 aBom_Upd01;

	protected void initBom_Upd01() {
		this.info = PDef.MA_MABSL0030_Bom_Upd01_INFO;
		this.aBom_Upd01 = ((MABSL_BomLst)this).new Bom_Upd01();
	}

	public static MABSL_BomLst.Bom_Upd01 crtBom_Upd01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initBom_Upd01();
		return lgc.aBom_Upd01;
	}

	protected void paramBom_Upd01(MCParam p) {
		if (this.aBom_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBom_Upd01.up0());
	}

	protected void doBom_Upd01() {
		aBom_Upd01.call();
	};

	/**
	 * Bom_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createBom_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
	}

	/**
	 * Bom_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createBom_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
	}
	protected MABSL_BomLst.Bom_DelChk01 aBom_DelChk01;

	protected void initBom_DelChk01() {
		this.info = PDef.MA_MABSL0030_Bom_DelChk01_INFO;
		this.aBom_DelChk01 = ((MABSL_BomLst)this).new Bom_DelChk01();
	}

	public static MABSL_BomLst.Bom_DelChk01 crtBom_DelChk01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initBom_DelChk01();
		return lgc.aBom_DelChk01;
	}

	protected void paramBom_DelChk01(MCParam p) {
		if (this.aBom_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBom_DelChk01.up0());
	}

	protected void doBom_DelChk01() {
		aBom_DelChk01.call();
	};

	/**
	 * Bom_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createBom_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
	}

	/**
	 * Bom_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createBom_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
	}
	protected MABSL_BomLst.Bom_Del01 aBom_Del01;

	protected void initBom_Del01() {
		this.info = PDef.MA_MABSL0030_Bom_Del01_INFO;
		this.aBom_Del01 = ((MABSL_BomLst)this).new Bom_Del01();
	}

	public static MABSL_BomLst.Bom_Del01 crtBom_Del01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initBom_Del01();
		return lgc.aBom_Del01;
	}

	protected void paramBom_Del01(MCParam p) {
		if (this.aBom_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBom_Del01.up0());
	}

	protected void doBom_Del01() {
		aBom_Del01.call();
	};

	/**
	 * Bom_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createBom_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
	}

	/**
	 * Bom_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createBom_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
	}
	protected MABSL_BomLst.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0030_Srch01_INFO;
		this.aSrch01 = ((MABSL_BomLst)this).new Srch01();
	}

	public static MABSL_BomLst.Srch01 crtSrch01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0030.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMABS.MABSL0030.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Srch01_RsltR.class);
	}
	protected MABSL_BomLst.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL0030_Upd01_INFO;
		this.aUpd01 = ((MABSL_BomLst)this).new Upd01();
	}

	public static MABSL_BomLst.Upd01 crtUpd01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
	}
	protected MABSL_BomLst.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABSL0030_Del01_INFO;
		this.aDel01 = ((MABSL_BomLst)this).new Del01();
	}

	public static MABSL_BomLst.Del01 crtDel01() {
		MABSL_BomLst lgc = new MABSL_BomLst();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createDel01_DtlR(){
		return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Bom_UpdChk01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録前チェックを行います。<br>
	 */
	abstract public class Bom_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bom_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bom_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bom_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createBom_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
		}

		/**
		 * Bom_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createBom_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Bom_Upd01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	abstract public class Bom_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bom_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BOM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BOM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BOM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bom_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BOM_R.create("T1"));
			chkMaster = MCController.create(MAM_BOM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BOM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BOM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BOM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bom_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createBom_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
		}

		/**
		 * Bom_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createBom_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src_Bom_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Bom_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BOM_R r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BOM_R> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				MAM_BOM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src_Bom_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Bom_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BOM_R r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BOM_R> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				MAM_BOM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Bom_DelChk01オペレーション.<p>
	 *
	 * ＢＯＭマスタの削除前チェックを行います。<br>
	 */
	abstract public class Bom_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bom_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bom_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bom_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createBom_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
		}

		/**
		 * Bom_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createBom_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}


	}
	/**
	 * Bom_Del01オペレーション.<p>
	 *
	 * ＢＯＭマスタの削除を行います。<br>
	 */
	abstract public class Bom_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bom_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BOM_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bom_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BOM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BOM_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bom_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createBom_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
		}

		/**
		 * Bom_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createBom_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> src_Bom_Del01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Bom_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BOM_R r_dest, mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BOM_R> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src : src){
				MAM_BOM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＢＯＭマスタの検索を行います。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0030.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BOM_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BOM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BOM_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BOM_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BOM_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0030.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0030.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_BOM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_BOM_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_BOM_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0030.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMABS.MABSL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bom_chng_typ</td></tr>
		 * 	<tr><td><br></td><td>chng_st_dt</td></tr>
		 * 	<tr><td><br></td><td>chng_end_dt</td></tr>
		 * 	<tr><td><br></td><td>chng_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chng_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>old_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>old_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>old_alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>new_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>new_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>new_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>new_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>new_ver_no</td></tr>
		 * 	<tr><td><br></td><td>new_alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>new_alt_grp_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0030.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0030.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_dec_place</td></tr>
		 * 	<tr><td><br></td><td>chd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>par_def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>chd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_def_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> dest_Srch01_Rslt, MCList<MAM_BOM_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("par_itm_nm", "par_itm_nm");
				addColumnPathMap("par_itm_typ", "par_itm_typ");
				addColumnPathMap("par_itm_typ_d_cd", "par_itm_typ_d_cd");
				addColumnPathMap("par_itm_typ_d_nm", "par_itm_typ_d_nm");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("par_base_unit_cd", "par_base_unit_cd");
				addColumnPathMap("par_base_unit_nm", "par_base_unit_nm");
				addColumnPathMap("chd_base_unit_cd", "chd_base_unit_cd");
				addColumnPathMap("chd_base_unit_nm", "chd_base_unit_nm");
				addColumnPathMap("chd_itm_typ", "chd_itm_typ");
				addColumnPathMap("chd_itm_typ_d_cd", "chd_itm_typ_d_cd");
				addColumnPathMap("chd_itm_typ_d_nm", "chd_itm_typ_d_nm");
				addColumnPathMap("chd_stk_mng_typ", "chd_stk_mng_typ");
				addColumnPathMap("chd_asset_mng_typ", "chd_asset_mng_typ");
				addColumnPathMap("par_dec_place", "par_dec_place");
				addColumnPathMap("chd_dec_place", "chd_dec_place");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("par_sno1_mng_typ", "par_sno1_mng_typ");
				addColumnPathMap("par_sno2_mng_typ", "par_sno2_mng_typ");
				addColumnPathMap("par_sno3_mng_typ", "par_sno3_mng_typ");
				addColumnPathMap("par_sno4_mng_typ", "par_sno4_mng_typ");
				addColumnPathMap("par_def_bom_ptn", "par_def_bom_ptn");
				addColumnPathMap("chd_sno1_mng_typ", "chd_sno1_mng_typ");
				addColumnPathMap("chd_sno2_mng_typ", "chd_sno2_mng_typ");
				addColumnPathMap("chd_sno3_mng_typ", "chd_sno3_mng_typ");
				addColumnPathMap("chd_sno4_mng_typ", "chd_sno4_mng_typ");
				addColumnPathMap("chd_def_bom_ptn", "chd_def_bom_ptn");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0030.Srch01_RsltR r_dest, MAM_BOM_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0030.Srch01_RsltR> dest, MCList<MAM_BOM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_BOM_R r_src : src){
				mcframe.serverMABS.MABSL0030.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>chng_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_no_bom</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src_Upd01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ph_flg", "ph_flg");
				addColumnPathMap("ph_bom_ptn", "ph_bom_ptn");
				addColumnPathMap("alt_itm_flg", "alt_itm_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("sno_typ1", "sno_typ1");
				addColumnPathMap("sno_typ2", "sno_typ2");
				addColumnPathMap("sno_typ3", "sno_typ3");
				addColumnPathMap("sno_typ4", "sno_typ4");
				addColumnPathMap("min_sno1", "min_sno1");
				addColumnPathMap("max_sno1", "max_sno1");
				addColumnPathMap("min_sno2", "min_sno2");
				addColumnPathMap("max_sno2", "max_sno2");
				addColumnPathMap("min_sno3", "min_sno3");
				addColumnPathMap("max_sno3", "max_sno3");
				addColumnPathMap("min_sno4", "min_sno4");
				addColumnPathMap("max_sno4", "max_sno4");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("byprod_flg", "byprod_flg");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("chng_no", "chng_no");
				addColumnPathMap("ext_sys_no_bom", "ext_sys_no_bom");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Del01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_DelChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0030.MABSL_BomLst.Bom_Del01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_DelChk01();
			upd01 = mcframe.serverMABS.MABSL0030.MABSL_BomLst.crtBom_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_BomLst)MABSL_BomLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR createDel01_DtlR(){
			return mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_BomLst)MABSL_BomLst_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> src_Del01_Dtl){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl);
			up_CALL_OPE01_upd01_0(dest1_0, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bom_key", "bom_key");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0030.Bom_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}