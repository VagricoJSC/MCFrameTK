package mcframe.serverMAUC.MAUCL0060;

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
 * "MAUCL_Num"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_Num_MC_A extends mcframe.serverFXBA.FXBAL0010.FXBAL_MCLogicBase {
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
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_Num.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MAUCL0060_Upd01_INFO;
		this.aUpd01 = ((MAUCL_Num)this).new Upd01();
	}

	public static MAUCL_Num.Upd01 crtUpd01() {
		MAUCL_Num lgc = new MAUCL_Num();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * ElmArgsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0060.ElmArgsR createElmArgsR(){
		return mcframe.serverMAUC.MAUCL0060.ElmArgsR.create();
	}

	/**
	 * ArgsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0060.ArgsR createArgsR(){
		return mcframe.serverMAUC.MAUCL0060.ArgsR.create();
	}

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0060.Upd01_RsltR createUpd01_RsltR(){
		return mcframe.serverMAUC.MAUCL0060.Upd01_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発番処理を実行します<br>
	 */
	abstract public class Upd01 extends MCOperation {
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
		private final mcframe.serverMAUC.MAUCL0060.ArgsR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0060.Upd01_RsltR down0;
		/** [ElmArgs]ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0060.ElmArgsR aElmArgs;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL0060.ArgsR.create();
			down0 = mcframe.serverMAUC.MAUCL0060.Upd01_RsltR.create();
			aElmArgs = mcframe.serverMAUC.MAUCL0060.ElmArgsR.create();

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
			invoke((MAUCL_Num)MAUCL_Num_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ElmArgsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0060.ElmArgsR createElmArgsR(){
			return mcframe.serverMAUC.MAUCL0060.ElmArgsR.create();
		}

		/**
		 * ArgsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0060.ArgsR createArgsR(){
			return mcframe.serverMAUC.MAUCL0060.ArgsR.create();
		}

		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0060.Upd01_RsltR createUpd01_RsltR(){
			return mcframe.serverMAUC.MAUCL0060.Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>num_biz_typ</td></tr>
		 * 	<tr><td><br></td><td>elm_args.num_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>elm_args.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.co_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.bp_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.site_cd</td></tr>
		 * 	<tr><td><br></td><td>elm_args.lot_no</td></tr>
		 * 	<tr><td><br></td><td>elm_args.chd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>elm_args.chd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>elm_args.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno1</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno2</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno3</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno4</td></tr>
		 * 	<tr><td><br></td><td>elm_args.dt</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str2</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str3</td></tr>
		 * 	<tr><td><br></td><td>elm_args.num</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub1_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub2_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.itm_sub3_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.loc_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.dpt_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.co_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.bp_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.wg_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.site_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.lot_no_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.chd_lot_no_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.chd_sublot_no_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.bp_lot_no_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno1_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno2_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno3_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.sno4_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.trd_cd_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.dt_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str2_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.str3_label_nm</td></tr>
		 * 	<tr><td><br></td><td>elm_args.num_label_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0060.ArgsR
		 */
		public mcframe.serverMAUC.MAUCL0060.ArgsR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0060.Upd01_RsltR
		 */
		public mcframe.serverMAUC.MAUCL0060.Upd01_RsltR down0() {
			return down0;
		}


		/**
		 * [ElmArgs]ブロックのコンテナaElmArgsRを返します。
		 *
		 * @return ElmArgsR
		 */
		public mcframe.serverMAUC.MAUCL0060.ElmArgsR ElmArgs() {
			return aElmArgs;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_Num)MAUCL_Num_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}