package mcframe.serverMSLA.MSLAL5020;

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
 * "MSLAL_PoSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_PoSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_PoSendIfService.PoSendIf_Upd01 aPoSendIf_Upd01;

	protected void initPoSendIf_Upd01() {
		this.info = PDef.MS_MSLAL5020_PoSendIf_Upd01_INFO;
		this.aPoSendIf_Upd01 = ((MSLAL_PoSendIfService)this).new PoSendIf_Upd01();
	}

	public static MSLAL_PoSendIfService.PoSendIf_Upd01 crtPoSendIf_Upd01() {
		MSLAL_PoSendIfService lgc = new MSLAL_PoSendIfService();
		lgc.initPoSendIf_Upd01();
		return lgc.aPoSendIf_Upd01;
	}

	protected void paramPoSendIf_Upd01(MCParam p) {
		if (this.aPoSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSendIf_Upd01.up0());
		p.addUpBlock(aPoSendIf_Upd01.up1());
	}

	protected void doPoSendIf_Upd01() {
		aPoSendIf_Upd01.call();
	};

	/**
	 * PoSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR createPoSendIf_Upd01_DtlR(){
		return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR.create();
	}

	/**
	 * PoSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR> createPoSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR.class);
	}

	/**
	 * PoSendIf_Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R createPoSendIf_Upd01_Dtl2R(){
		return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R.create();
	}

	/**
	 * PoSendIf_Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R> createPoSendIf_Upd01_Dtl2L(){
		return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R.class);
	}
	protected MSLAL_PoSendIfService.PoSendIf_Upd02 aPoSendIf_Upd02;

	protected void initPoSendIf_Upd02() {
		this.info = PDef.MS_MSLAL5020_PoSendIf_Upd02_INFO;
		this.aPoSendIf_Upd02 = ((MSLAL_PoSendIfService)this).new PoSendIf_Upd02();
	}

	public static MSLAL_PoSendIfService.PoSendIf_Upd02 crtPoSendIf_Upd02() {
		MSLAL_PoSendIfService lgc = new MSLAL_PoSendIfService();
		lgc.initPoSendIf_Upd02();
		return lgc.aPoSendIf_Upd02;
	}

	protected void paramPoSendIf_Upd02(MCParam p) {
		if (this.aPoSendIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoSendIf_Upd02.up0());
		p.addDownBlock(aPoSendIf_Upd02.down0());
	}

	protected void doPoSendIf_Upd02() {
		aPoSendIf_Upd02.call();
	};

	/**
	 * PoSendIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR createPoSendIf_Upd02_DtlR(){
		return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.create();
	}

	/**
	 * PoSendIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> createPoSendIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の発注をＩＦテーブルに書き込む<br>
	 */
	abstract public class PoSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R> up1;
		
		
		// コンストラクタ
		protected PoSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR.class);
			up1 = MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_PoSendIfService)MSLAL_PoSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR createPoSendIf_Upd01_DtlR(){
			return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR.create();
		}

		/**
		 * PoSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR> createPoSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR.class);
		}

		/**
		 * PoSendIf_Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R createPoSendIf_Upd01_Dtl2R(){
			return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R.create();
		}

		/**
		 * PoSendIf_Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R> createPoSendIf_Upd01_Dtl2L(){
			return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>bef_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>is_src_aprvaf_srv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd01_Dtl2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoSendIfService)MSLAL_PoSendIfService_MC_A.this).info;
		}


	}
	/**
	 * PoSendIf_Upd02オペレーション.<p>
	 *
	 * 発注送信ＩＦを、送信または再送信します<br>
	 */
	abstract public class PoSendIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoSendIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected PoSendIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.class);

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
			invoke((MSLAL_PoSendIfService)MSLAL_PoSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoSendIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR createPoSendIf_Upd02_DtlR(){
			return mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.create();
		}

		/**
		 * PoSendIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> createPoSendIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5020.PoSendIf_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoSendIfService)MSLAL_PoSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}