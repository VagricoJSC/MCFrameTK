package mcframe.serverMABC.MABCL5010;

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
 * "MABCL_SundryItmRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_SundryItmRegService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_SundryItmRegService.SundryItm_Chk01 aSundryItm_Chk01;

	protected void initSundryItm_Chk01() {
		this.info = PDef.MA_MABCL5010_SundryItm_Chk01_INFO;
		this.aSundryItm_Chk01 = ((MABCL_SundryItmRegService)this).new SundryItm_Chk01();
	}

	public static MABCL_SundryItmRegService.SundryItm_Chk01 crtSundryItm_Chk01() {
		MABCL_SundryItmRegService lgc = new MABCL_SundryItmRegService();
		lgc.initSundryItm_Chk01();
		return lgc.aSundryItm_Chk01;
	}

	protected void paramSundryItm_Chk01(MCParam p) {
		if (this.aSundryItm_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSundryItm_Chk01.up0());
		p.addDownBlock(aSundryItm_Chk01.down0());
	}

	protected void doSundryItm_Chk01() {
		aSundryItm_Chk01.call();
	};

	/**
	 * SundryItm_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR createSundryItm_Chk01_DtlR(){
		return mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.create();
	}

	/**
	 * SundryItm_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> createSundryItm_Chk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.class);
	}
	protected MABCL_SundryItmRegService.SundryItm_Upd01 aSundryItm_Upd01;

	protected void initSundryItm_Upd01() {
		this.info = PDef.MA_MABCL5010_SundryItm_Upd01_INFO;
		this.aSundryItm_Upd01 = ((MABCL_SundryItmRegService)this).new SundryItm_Upd01();
	}

	public static MABCL_SundryItmRegService.SundryItm_Upd01 crtSundryItm_Upd01() {
		MABCL_SundryItmRegService lgc = new MABCL_SundryItmRegService();
		lgc.initSundryItm_Upd01();
		return lgc.aSundryItm_Upd01;
	}

	protected void paramSundryItm_Upd01(MCParam p) {
		if (this.aSundryItm_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSundryItm_Upd01.up0());
	}

	protected void doSundryItm_Upd01() {
		aSundryItm_Upd01.call();
	};

	/**
	 * SundryItm_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR createSundryItm_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR.create();
	}

	/**
	 * SundryItm_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR> createSundryItm_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SundryItm_Chk01オペレーション.<p>
	 *
	 * 諸口品マスタに登録可能かどうかチェックする。<br>
	 */
	abstract public class SundryItm_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SundryItm_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected SundryItm_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.class);

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
			invoke((MABCL_SundryItmRegService)MABCL_SundryItmRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SundryItm_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR createSundryItm_Chk01_DtlR(){
			return mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.create();
		}

		/**
		 * SundryItm_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> createSundryItm_Chk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> up0() {
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
		public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SundryItmRegService)MABCL_SundryItmRegService_MC_A.this).info;
		}


	}
	/**
	 * SundryItm_Upd01オペレーション.<p>
	 *
	 * 諸口品マスタを登録・更新する。<br>
	 */
	abstract public class SundryItm_Upd01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SundryItm_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected SundryItm_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR.class);

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
			invoke((MABCL_SundryItmRegService)MABCL_SundryItmRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SundryItm_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR createSundryItm_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR.create();
		}

		/**
		 * SundryItm_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR> createSundryItm_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SundryItmRegService)MABCL_SundryItmRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}