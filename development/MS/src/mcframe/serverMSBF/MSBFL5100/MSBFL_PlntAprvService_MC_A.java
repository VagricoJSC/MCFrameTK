package mcframe.serverMSBF.MSBFL5100;

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
 * "MSBFL_PlntAprvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_PlntAprvService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_PlntAprvService.PlntAprv_Chk01 aPlntAprv_Chk01;

	protected void initPlntAprv_Chk01() {
		this.info = PDef.MS_MSBFL5100_PlntAprv_Chk01_INFO;
		this.aPlntAprv_Chk01 = ((MSBFL_PlntAprvService)this).new PlntAprv_Chk01();
	}

	public static MSBFL_PlntAprvService.PlntAprv_Chk01 crtPlntAprv_Chk01() {
		MSBFL_PlntAprvService lgc = new MSBFL_PlntAprvService();
		lgc.initPlntAprv_Chk01();
		return lgc.aPlntAprv_Chk01;
	}

	protected void paramPlntAprv_Chk01(MCParam p) {
		if (this.aPlntAprv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlntAprv_Chk01.up0());
		p.addDownBlock(aPlntAprv_Chk01.down0());
	}

	protected void doPlntAprv_Chk01() {
		aPlntAprv_Chk01.call();
	};

	/**
	 * PlntAprv_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR createPlntAprv_Chk01_RsltR(){
		return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.create();
	}

	/**
	 * PlntAprv_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> createPlntAprv_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);
	}
	protected MSBFL_PlntAprvService.PlntAprv_Chk02 aPlntAprv_Chk02;

	protected void initPlntAprv_Chk02() {
		this.info = PDef.MS_MSBFL5100_PlntAprv_Chk02_INFO;
		this.aPlntAprv_Chk02 = ((MSBFL_PlntAprvService)this).new PlntAprv_Chk02();
	}

	public static MSBFL_PlntAprvService.PlntAprv_Chk02 crtPlntAprv_Chk02() {
		MSBFL_PlntAprvService lgc = new MSBFL_PlntAprvService();
		lgc.initPlntAprv_Chk02();
		return lgc.aPlntAprv_Chk02;
	}

	protected void paramPlntAprv_Chk02(MCParam p) {
		if (this.aPlntAprv_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlntAprv_Chk02.up0());
		p.addDownBlock(aPlntAprv_Chk02.down0());
	}

	protected void doPlntAprv_Chk02() {
		aPlntAprv_Chk02.call();
	};

	/**
	 * PlntAprv_Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR createPlntAprv_Chk02_RsltR(){
		return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.create();
	}

	/**
	 * PlntAprv_Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> createPlntAprv_Chk02_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.class);
	}
	protected MSBFL_PlntAprvService.PlntAprv_Upd01 aPlntAprv_Upd01;

	protected void initPlntAprv_Upd01() {
		this.info = PDef.MS_MSBFL5100_PlntAprv_Upd01_INFO;
		this.aPlntAprv_Upd01 = ((MSBFL_PlntAprvService)this).new PlntAprv_Upd01();
	}

	public static MSBFL_PlntAprvService.PlntAprv_Upd01 crtPlntAprv_Upd01() {
		MSBFL_PlntAprvService lgc = new MSBFL_PlntAprvService();
		lgc.initPlntAprv_Upd01();
		return lgc.aPlntAprv_Upd01;
	}

	protected void paramPlntAprv_Upd01(MCParam p) {
		if (this.aPlntAprv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlntAprv_Upd01.up0());
	}

	protected void doPlntAprv_Upd01() {
		aPlntAprv_Upd01.call();
	};

	/**
	 * PlntAprv_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR createPlntAprv_Upd01_RsltR(){
		return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.create();
	}

	/**
	 * PlntAprv_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> createPlntAprv_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PlntAprv_Chk01オペレーション.<p>
	 *
	 * 工場出荷承認予定登録前チェックを行う。<br>
	 */
	abstract public class PlntAprv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlntAprv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected PlntAprv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);

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
			invoke((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PlntAprv_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR createPlntAprv_Chk01_RsltR(){
			return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.create();
		}

		/**
		 * PlntAprv_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> createPlntAprv_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);
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
		 * 	<tr><td><br></td><td>plnt_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this).info;
		}


	}
	/**
	 * PlntAprv_Chk02オペレーション.<p>
	 *
	 * 出荷可能チェックを行う。<br>
	 */
	abstract public class PlntAprv_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlntAprv_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected PlntAprv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.class);

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
			invoke((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PlntAprv_Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR createPlntAprv_Chk02_RsltR(){
			return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.create();
		}

		/**
		 * PlntAprv_Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> createPlntAprv_Chk02_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>pre_inst_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this).info;
		}


	}
	/**
	 * PlntAprv_Upd01オペレーション.<p>
	 *
	 * 工場出荷承認予定登録を行う。<br>
	 */
	abstract public class PlntAprv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlntAprv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> up0;
		
		
		// コンストラクタ
		protected PlntAprv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);

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
			invoke((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlntAprv_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR createPlntAprv_Upd01_RsltR(){
			return mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.create();
		}

		/**
		 * PlntAprv_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> createPlntAprv_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_act_end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_act_judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5100.PlntAprv_Chk01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_PlntAprvService)MSBFL_PlntAprvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}