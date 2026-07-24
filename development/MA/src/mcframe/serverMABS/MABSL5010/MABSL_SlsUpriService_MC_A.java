package mcframe.serverMABS.MABSL5010;

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
 * "MABSL_SlsUpriService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_SlsUpriService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABSL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_SlsUpriService.SlsUpri_Sprt01 aSlsUpri_Sprt01;

	protected void initSlsUpri_Sprt01() {
		this.info = PDef.MA_MABSL5010_SlsUpri_Sprt01_INFO;
		this.aSlsUpri_Sprt01 = ((MABSL_SlsUpriService)this).new SlsUpri_Sprt01();
	}

	public static MABSL_SlsUpriService.SlsUpri_Sprt01 crtSlsUpri_Sprt01() {
		MABSL_SlsUpriService lgc = new MABSL_SlsUpriService();
		lgc.initSlsUpri_Sprt01();
		return lgc.aSlsUpri_Sprt01;
	}

	protected void paramSlsUpri_Sprt01(MCParam p) {
		if (this.aSlsUpri_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpri_Sprt01.up0());
		p.addDownBlock(aSlsUpri_Sprt01.down0());
	}

	protected void doSlsUpri_Sprt01() {
		aSlsUpri_Sprt01.call();
	};

	/**
	 * SlsUpri_Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR createSlsUpri_Sprt01_DtlR(){
		return mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.create();
	}

	/**
	 * SlsUpri_Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> createSlsUpri_Sprt01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsUpri_Sprt01オペレーション.<p>
	 *
	 * 販売単価を取得する。<br>
	 */
	abstract public class SlsUpri_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpri_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected SlsUpri_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.class);

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
			invoke((MABSL_SlsUpriService)MABSL_SlsUpriService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SlsUpri_Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR createSlsUpri_Sprt01_DtlR(){
			return mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.create();
		}

		/**
		 * SlsUpri_Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> createSlsUpri_Sprt01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.grp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.std_sls_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.std_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.qty</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.std_upri_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>not_err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.sls_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.std_sls_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.std_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_srv.interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_SlsUpriService)MABSL_SlsUpriService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}