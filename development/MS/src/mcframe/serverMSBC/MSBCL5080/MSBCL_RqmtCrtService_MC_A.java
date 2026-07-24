package mcframe.serverMSBC.MSBCL5080;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBCL_RqmtCrtService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_RqmtCrtService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL5080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_RqmtCrtService.RqmtCrt_Upd01 aRqmtCrt_Upd01;

	protected void initRqmtCrt_Upd01() {
		this.info = PDef.MS_MSBCL5080_RqmtCrt_Upd01_INFO;
		this.aRqmtCrt_Upd01 = ((MSBCL_RqmtCrtService)this).new RqmtCrt_Upd01();
	}

	public static MSBCL_RqmtCrtService.RqmtCrt_Upd01 crtRqmtCrt_Upd01() {
		MSBCL_RqmtCrtService lgc = new MSBCL_RqmtCrtService();
		lgc.initRqmtCrt_Upd01();
		return lgc.aRqmtCrt_Upd01;
	}

	protected void paramRqmtCrt_Upd01(MCParam p) {
		if (this.aRqmtCrt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRqmtCrt_Upd01.up0());
	}

	protected void doRqmtCrt_Upd01() {
		aRqmtCrt_Upd01.call();
	};

	/**
	 * RqmtCrt_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR createRqmtCrt_Upd01_CndR(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR.create();
	}
	protected MSBCL_RqmtCrtService.RqmtCrt_Calc01 aRqmtCrt_Calc01;

	protected void initRqmtCrt_Calc01() {
		this.info = PDef.MS_MSBCL5080_RqmtCrt_Calc01_INFO;
		this.aRqmtCrt_Calc01 = ((MSBCL_RqmtCrtService)this).new RqmtCrt_Calc01();
	}

	public static MSBCL_RqmtCrtService.RqmtCrt_Calc01 crtRqmtCrt_Calc01() {
		MSBCL_RqmtCrtService lgc = new MSBCL_RqmtCrtService();
		lgc.initRqmtCrt_Calc01();
		return lgc.aRqmtCrt_Calc01;
	}

	protected void paramRqmtCrt_Calc01(MCParam p) {
		if (this.aRqmtCrt_Calc01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRqmtCrt_Calc01.up0());
		p.addUpBlock(aRqmtCrt_Calc01.up1());
		p.addUpBlock(aRqmtCrt_Calc01.up2());
		p.addDownBlock(aRqmtCrt_Calc01.down0());
	}

	protected void doRqmtCrt_Calc01() {
		aRqmtCrt_Calc01.call();
	};

	/**
	 * RqmtCrt_Calc01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR createRqmtCrt_Calc01_CndR(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR.create();
	}

	/**
	 * RqmtCrt_Calc01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R createRqmtCrt_Calc01_Dtl1R(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R.create();
	}

	/**
	 * RqmtCrt_Calc01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R> createRqmtCrt_Calc01_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R.class);
	}

	/**
	 * RqmtCrt_Calc01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R createRqmtCrt_Calc01_Dtl2R(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R.create();
	}

	/**
	 * RqmtCrt_Calc01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R> createRqmtCrt_Calc01_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R.class);
	}

	/**
	 * RqmtCrt_Calc01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR createRqmtCrt_Calc01_RsltR(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR.create();
	}

	/**
	 * RqmtCrt_Calc01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR> createRqmtCrt_Calc01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR.class);
	}

	/**
	 * RqmtCrt_Calc01_WkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR createRqmtCrt_Calc01_WkR(){
		return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR.create();
	}

	/**
	 * RqmtCrt_Calc01_WkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR> createRqmtCrt_Calc01_WkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RqmtCrt_Upd01オペレーション.<p>
	 *
	 */
	abstract public class RqmtCrt_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RqmtCrt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected RqmtCrt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR.create();

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
			invoke((MSBCL_RqmtCrtService)MSBCL_RqmtCrtService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RqmtCrt_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR createRqmtCrt_Upd01_CndR(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_RqmtCrtService)MSBCL_RqmtCrtService_MC_A.this).info;
		}


	}
	/**
	 * RqmtCrt_Calc01オペレーション.<p>
	 *
	 */
	abstract public class RqmtCrt_Calc01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RqmtCrt_Calc01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR> down0;
		/** [RqmtCrt_Calc01_Wk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR> aRqmtCrt_Calc01_Wk;
		
		
		// コンストラクタ
		protected RqmtCrt_Calc01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR.class);
			aRqmtCrt_Calc01_Wk = MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR.class);

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
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_RqmtCrtService)MSBCL_RqmtCrtService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RqmtCrt_Calc01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR createRqmtCrt_Calc01_CndR(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR.create();
		}

		/**
		 * RqmtCrt_Calc01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R createRqmtCrt_Calc01_Dtl1R(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R.create();
		}

		/**
		 * RqmtCrt_Calc01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R> createRqmtCrt_Calc01_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R.class);
		}

		/**
		 * RqmtCrt_Calc01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R createRqmtCrt_Calc01_Dtl2R(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R.create();
		}

		/**
		 * RqmtCrt_Calc01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R> createRqmtCrt_Calc01_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R.class);
		}

		/**
		 * RqmtCrt_Calc01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR createRqmtCrt_Calc01_RsltR(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR.create();
		}

		/**
		 * RqmtCrt_Calc01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR> createRqmtCrt_Calc01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR.class);
		}

		/**
		 * RqmtCrt_Calc01_WkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR createRqmtCrt_Calc01_WkR(){
			return mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR.create();
		}

		/**
		 * RqmtCrt_Calc01_WkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR> createRqmtCrt_Calc01_WkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ac_cl_mon_base</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR
		 */
		public mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pln_ym</td></tr>
		 * 	<tr><td><br></td><td>prod_ym</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>prod_qty_by_day</td></tr>
		 * 	<tr><td><br></td><td>prod_rate</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>prod_begin_day</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>week_div_mons</td></tr>
		 * 	<tr><td><br></td><td>period_div_mons</td></tr>
		 * 	<tr><td><br></td><td>rqmt_mons</td></tr>
		 * 	<tr><td><br></td><td>prcd_mons</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_sppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_RsltR> down0() {
			return down0;
		}


		/**
		 * [RqmtCrt_Calc01_Wk]ブロックのコンテナaRqmtCrt_Calc01_WkLを返します。
		 *
		 * @return RqmtCrt_Calc01_WkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL5080.RqmtCrt_Calc01_WkR> RqmtCrt_Calc01_Wk() {
			return aRqmtCrt_Calc01_Wk;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_RqmtCrtService)MSBCL_RqmtCrtService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}