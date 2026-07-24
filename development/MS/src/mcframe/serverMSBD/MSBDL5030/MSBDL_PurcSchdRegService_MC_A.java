package mcframe.serverMSBD.MSBDL5030;

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
 * "MSBDL_PurcSchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcSchdRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcSchdRegService.PurcSchd_Upd01 aPurcSchd_Upd01;

	protected void initPurcSchd_Upd01() {
		this.info = PDef.MS_MSBDL5030_PurcSchd_Upd01_INFO;
		this.aPurcSchd_Upd01 = ((MSBDL_PurcSchdRegService)this).new PurcSchd_Upd01();
	}

	public static MSBDL_PurcSchdRegService.PurcSchd_Upd01 crtPurcSchd_Upd01() {
		MSBDL_PurcSchdRegService lgc = new MSBDL_PurcSchdRegService();
		lgc.initPurcSchd_Upd01();
		return lgc.aPurcSchd_Upd01;
	}

	protected void paramPurcSchd_Upd01(MCParam p) {
		if (this.aPurcSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSchd_Upd01.up0());
		p.addDownBlock(aPurcSchd_Upd01.down0());
	}

	protected void doPurcSchd_Upd01() {
		aPurcSchd_Upd01.call();
	};

	/**
	 * PurcSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR createPurcSchd_DtlR(){
		return mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.create();
	}

	/**
	 * PurcSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> createPurcSchd_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
	}
	protected MSBDL_PurcSchdRegService.PurcSchd_Upd02 aPurcSchd_Upd02;

	protected void initPurcSchd_Upd02() {
		this.info = PDef.MS_MSBDL5030_PurcSchd_Upd02_INFO;
		this.aPurcSchd_Upd02 = ((MSBDL_PurcSchdRegService)this).new PurcSchd_Upd02();
	}

	public static MSBDL_PurcSchdRegService.PurcSchd_Upd02 crtPurcSchd_Upd02() {
		MSBDL_PurcSchdRegService lgc = new MSBDL_PurcSchdRegService();
		lgc.initPurcSchd_Upd02();
		return lgc.aPurcSchd_Upd02;
	}

	protected void paramPurcSchd_Upd02(MCParam p) {
		if (this.aPurcSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSchd_Upd02.up0());
		p.addDownBlock(aPurcSchd_Upd02.down0());
	}

	protected void doPurcSchd_Upd02() {
		aPurcSchd_Upd02.call();
	};
	protected MSBDL_PurcSchdRegService.PurcSchd_Chk01 aPurcSchd_Chk01;

	protected void initPurcSchd_Chk01() {
		this.info = PDef.MS_MSBDL5030_PurcSchd_Chk01_INFO;
		this.aPurcSchd_Chk01 = ((MSBDL_PurcSchdRegService)this).new PurcSchd_Chk01();
	}

	public static MSBDL_PurcSchdRegService.PurcSchd_Chk01 crtPurcSchd_Chk01() {
		MSBDL_PurcSchdRegService lgc = new MSBDL_PurcSchdRegService();
		lgc.initPurcSchd_Chk01();
		return lgc.aPurcSchd_Chk01;
	}

	protected void paramPurcSchd_Chk01(MCParam p) {
		if (this.aPurcSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcSchd_Chk01.up0());
		p.addDownBlock(aPurcSchd_Chk01.down0());
	}

	protected void doPurcSchd_Chk01() {
		aPurcSchd_Chk01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcSchd_Upd01オペレーション.<p>
	 *
	 */
	abstract public class PurcSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR createPurcSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.create();
		}

		/**
		 * PurcSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> createPurcSchd_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>no_cred_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.trd_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.non_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcSchd_Upd02オペレーション.<p>
	 *
	 */
	abstract public class PurcSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR createPurcSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.create();
		}

		/**
		 * PurcSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> createPurcSchd_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>no_cred_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcSchd_Chk01オペレーション.<p>
	 *
	 */
	abstract public class PurcSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR createPurcSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.create();
		}

		/**
		 * PurcSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> createPurcSchd_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd.purc_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcSchdRegService)MSBDL_PurcSchdRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}