package mcframe.serverMABS.MABSL5040;

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
 * "MABSL_GpBomReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_GpBomReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABSL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_GpBomReg.GpBom_UpdChk01 aGpBom_UpdChk01;

	protected void initGpBom_UpdChk01() {
		this.info = PDef.MA_MABSL5040_GpBom_UpdChk01_INFO;
		this.aGpBom_UpdChk01 = ((MABSL_GpBomReg)this).new GpBom_UpdChk01();
	}

	public static MABSL_GpBomReg.GpBom_UpdChk01 crtGpBom_UpdChk01() {
		MABSL_GpBomReg lgc = new MABSL_GpBomReg();
		lgc.initGpBom_UpdChk01();
		return lgc.aGpBom_UpdChk01;
	}

	protected void paramGpBom_UpdChk01(MCParam p) {
		if (this.aGpBom_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpBom_UpdChk01.up0());
	}

	protected void doGpBom_UpdChk01() {
		aGpBom_UpdChk01.call();
	};

	/**
	 * GpBom_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR createGpBom_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.create();
	}

	/**
	 * GpBom_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> createGpBom_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);
	}
	protected MABSL_GpBomReg.GpBom_Upd01 aGpBom_Upd01;

	protected void initGpBom_Upd01() {
		this.info = PDef.MA_MABSL5040_GpBom_Upd01_INFO;
		this.aGpBom_Upd01 = ((MABSL_GpBomReg)this).new GpBom_Upd01();
	}

	public static MABSL_GpBomReg.GpBom_Upd01 crtGpBom_Upd01() {
		MABSL_GpBomReg lgc = new MABSL_GpBomReg();
		lgc.initGpBom_Upd01();
		return lgc.aGpBom_Upd01;
	}

	protected void paramGpBom_Upd01(MCParam p) {
		if (this.aGpBom_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpBom_Upd01.up0());
	}

	protected void doGpBom_Upd01() {
		aGpBom_Upd01.call();
	};

	/**
	 * GpBom_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR createGpBom_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.create();
	}

	/**
	 * GpBom_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> createGpBom_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);
	}
	protected MABSL_GpBomReg.GpBom_DelChk01 aGpBom_DelChk01;

	protected void initGpBom_DelChk01() {
		this.info = PDef.MA_MABSL5040_GpBom_DelChk01_INFO;
		this.aGpBom_DelChk01 = ((MABSL_GpBomReg)this).new GpBom_DelChk01();
	}

	public static MABSL_GpBomReg.GpBom_DelChk01 crtGpBom_DelChk01() {
		MABSL_GpBomReg lgc = new MABSL_GpBomReg();
		lgc.initGpBom_DelChk01();
		return lgc.aGpBom_DelChk01;
	}

	protected void paramGpBom_DelChk01(MCParam p) {
		if (this.aGpBom_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpBom_DelChk01.up0());
	}

	protected void doGpBom_DelChk01() {
		aGpBom_DelChk01.call();
	};

	/**
	 * GpBom_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR createGpBom_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.create();
	}

	/**
	 * GpBom_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> createGpBom_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);
	}
	protected MABSL_GpBomReg.GpBom_Del01 aGpBom_Del01;

	protected void initGpBom_Del01() {
		this.info = PDef.MA_MABSL5040_GpBom_Del01_INFO;
		this.aGpBom_Del01 = ((MABSL_GpBomReg)this).new GpBom_Del01();
	}

	public static MABSL_GpBomReg.GpBom_Del01 crtGpBom_Del01() {
		MABSL_GpBomReg lgc = new MABSL_GpBomReg();
		lgc.initGpBom_Del01();
		return lgc.aGpBom_Del01;
	}

	protected void paramGpBom_Del01(MCParam p) {
		if (this.aGpBom_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpBom_Del01.up0());
	}

	protected void doGpBom_Del01() {
		aGpBom_Del01.call();
	};

	/**
	 * GpBom_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR createGpBom_Del01_DtlR(){
		return mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.create();
	}

	/**
	 * GpBom_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> createGpBom_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * GpBom_UpdChk01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの登録前チェックを行います。<br>
	 */
	abstract public class GpBom_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpBom_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected GpBom_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);

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
			invoke((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpBom_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR createGpBom_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.create();
		}

		/**
		 * GpBom_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> createGpBom_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key_key</td></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>bom_typ</td></tr>
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
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this).info;
		}


	}
	/**
	 * GpBom_Upd01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの登録を行います。<br>
	 */
	abstract public class GpBom_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpBom_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_BOM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_BOM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_BOM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_BOM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_BOM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_BOM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_BOM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpBom_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_GP_BOM_R.create("T1"));
			chkMaster = MCController.create(MAM_GP_BOM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_GP_BOM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_GP_BOM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_GP_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_GP_BOM_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpBom_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR createGpBom_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.create();
		}

		/**
		 * GpBom_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> createGpBom_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key_key</td></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>bom_typ</td></tr>
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
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_char11</td></tr>
		 * 	<tr><td><br></td><td>sub_char12</td></tr>
		 * 	<tr><td><br></td><td>sub_char13</td></tr>
		 * 	<tr><td><br></td><td>sub_char14</td></tr>
		 * 	<tr><td><br></td><td>sub_char15</td></tr>
		 * 	<tr><td><br></td><td>sub_char16</td></tr>
		 * 	<tr><td><br></td><td>sub_char17</td></tr>
		 * 	<tr><td><br></td><td>sub_char18</td></tr>
		 * 	<tr><td><br></td><td>sub_char19</td></tr>
		 * 	<tr><td><br></td><td>sub_char20</td></tr>
		 * 	<tr><td><br></td><td>sub_char21</td></tr>
		 * 	<tr><td><br></td><td>sub_char22</td></tr>
		 * 	<tr><td><br></td><td>sub_char23</td></tr>
		 * 	<tr><td><br></td><td>sub_char24</td></tr>
		 * 	<tr><td><br></td><td>sub_char25</td></tr>
		 * 	<tr><td><br></td><td>sub_char26</td></tr>
		 * 	<tr><td><br></td><td>sub_char27</td></tr>
		 * 	<tr><td><br></td><td>sub_char28</td></tr>
		 * 	<tr><td><br></td><td>sub_char29</td></tr>
		 * 	<tr><td><br></td><td>sub_char30</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_num4</td></tr>
		 * 	<tr><td><br></td><td>sub_num5</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>sub_dt5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_GP_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> src_GpBom_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_GpBom_Upd01_Dtl);
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
				addColumnPathMap("bom_typ", "bom_typ");
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
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sub_char4", "sub_char4");
				addColumnPathMap("sub_char5", "sub_char5");
				addColumnPathMap("sub_char6", "sub_char6");
				addColumnPathMap("sub_char7", "sub_char7");
				addColumnPathMap("sub_char8", "sub_char8");
				addColumnPathMap("sub_char9", "sub_char9");
				addColumnPathMap("sub_char10", "sub_char10");
				addColumnPathMap("sub_char11", "sub_char11");
				addColumnPathMap("sub_char12", "sub_char12");
				addColumnPathMap("sub_char13", "sub_char13");
				addColumnPathMap("sub_char14", "sub_char14");
				addColumnPathMap("sub_char15", "sub_char15");
				addColumnPathMap("sub_char16", "sub_char16");
				addColumnPathMap("sub_char17", "sub_char17");
				addColumnPathMap("sub_char18", "sub_char18");
				addColumnPathMap("sub_char19", "sub_char19");
				addColumnPathMap("sub_char20", "sub_char20");
				addColumnPathMap("sub_char21", "sub_char21");
				addColumnPathMap("sub_char22", "sub_char22");
				addColumnPathMap("sub_char23", "sub_char23");
				addColumnPathMap("sub_char24", "sub_char24");
				addColumnPathMap("sub_char25", "sub_char25");
				addColumnPathMap("sub_char26", "sub_char26");
				addColumnPathMap("sub_char27", "sub_char27");
				addColumnPathMap("sub_char28", "sub_char28");
				addColumnPathMap("sub_char29", "sub_char29");
				addColumnPathMap("sub_char30", "sub_char30");
				addColumnPathMap("sub_num1", "sub_num1");
				addColumnPathMap("sub_num2", "sub_num2");
				addColumnPathMap("sub_num3", "sub_num3");
				addColumnPathMap("sub_num4", "sub_num4");
				addColumnPathMap("sub_num5", "sub_num5");
				addColumnPathMap("sub_dt1", "sub_dt1");
				addColumnPathMap("sub_dt2", "sub_dt2");
				addColumnPathMap("sub_dt3", "sub_dt3");
				addColumnPathMap("sub_dt4", "sub_dt4");
				addColumnPathMap("sub_dt5", "sub_dt5");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_GP_BOM_R r_dest, mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_GP_BOM_R> dest, MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR r_src : src){
				MAM_GP_BOM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_GP_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> src_GpBom_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_GpBom_Upd01_Dtl);
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
		protected void up_MAIN_chkMaster_0(MAM_GP_BOM_R r_dest, mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_GP_BOM_R> dest, MCList<mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL5040.GpBom_UpdChk01_DtlR r_src : src){
				MAM_GP_BOM_R r_dest = dest.createRow();
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
	 * GpBom_DelChk01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの削除前チェックを行います。<br>
	 */
	abstract public class GpBom_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpBom_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected GpBom_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);

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
			invoke((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpBom_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR createGpBom_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.create();
		}

		/**
		 * GpBom_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> createGpBom_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key_key</td></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this).info;
		}


	}
	/**
	 * GpBom_Del01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの削除を行います。<br>
	 */
	abstract public class GpBom_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpBom_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_BOM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_BOM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_BOM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_BOM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_BOM_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpBom_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_GP_BOM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_GP_BOM_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_GP_BOM_R&gt; （{@link #updMaster_up0}）<br>
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
			invoke((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpBom_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR createGpBom_Del01_DtlR(){
			return mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.create();
		}

		/**
		 * GpBom_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> createGpBom_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bom_key_key</td></tr>
		 * 	<tr><td><br></td><td>bom_key</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_GpBomReg)MABSL_GpBomReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_GP_BOM_R> dest0_0, MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> src_GpBom_Del01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_GpBom_Del01_Dtl);
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
		protected void up_UPDATE_updMaster_0(MAM_GP_BOM_R r_dest, mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_GP_BOM_R> dest, MCList<mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL5040.GpBom_DelChk01_DtlR r_src : src){
				MAM_GP_BOM_R r_dest = dest.createRow();
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

	//FMCB LOGIC_CONTROLLER END
}