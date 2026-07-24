package mcframe.serverMABS.MABSL1120;

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
 * "MABSL_SlsItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_SlsItmReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABSL1120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_SlsItmReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL1120_Srch01_INFO;
		this.aSrch01 = ((MABSL_SlsItmReg)this).new Srch01();
	}

	public static MABSL_SlsItmReg.Srch01 crtSrch01() {
		MABSL_SlsItmReg lgc = new MABSL_SlsItmReg();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL1120.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt5R.class);
	}
	protected MABSL_SlsItmReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL1120_Upd01_INFO;
		this.aUpd01 = ((MABSL_SlsItmReg)this).new Upd01();
	}

	public static MABSL_SlsItmReg.Upd01 crtUpd01() {
		MABSL_SlsItmReg lgc = new MABSL_SlsItmReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1120.Srch01_Rslt1R createUpd01_Dtl1R(){
		return mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
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
		private final mcframe.serverMABS.MABSL1120.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> down4;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM__R&gt;<br>
		 * 第1 上りブロッククラス MAM_ITM__R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM__R> c0;
		// 連携ロジック上り
		public final MAM_ITM__R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_ITM__R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPLN_ITM_CONF_R&gt;<br>
		 * 第1 上りブロッククラス MAM_SPLN_ITM_CONF_R （{@link #c1_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPLN_ITM_CONF_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPLN_ITM_CONF_R> c1;
		// 連携ロジック上り
		public final MAM_SPLN_ITM_CONF_R c1_up0;
		// 連携ロジック下り
		public final MCList<MAM_SPLN_ITM_CONF_R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DMND_DIV_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DMND_DIV_R&gt;<br>
		 * 第1 上りブロッククラス MAM_DMND_DIV_R （{@link #c2_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_DMND_DIV_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_DMND_DIV_R> c2;
		// 連携ロジック上り
		public final MAM_DMND_DIV_R c2_up0;
		// 連携ロジック下り
		public final MCList<MAM_DMND_DIV_R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 * 第1 上りブロッククラス MAM_BP_ITM_R （{@link #c3_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_ITM_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> c3;
		// 連携ロジック上り
		public final MAM_BP_ITM_R c3_up0;
		// 連携ロジック下り
		public final MCList<MAM_BP_ITM_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_STR_LN_R&gt;<br>
		 * 第1 上りブロッククラス MAM_ITM_STR_LN_R （{@link #c4_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_STR_LN_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_STR_LN_R> c4;
		// 連携ロジック上り
		public final MAM_ITM_STR_LN_R c4_up0;
		// 連携ロジック下り
		public final MCList<MAM_ITM_STR_LN_R> c4_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL1120.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt5R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM__R.create("T1"));
			c1 = MCController.create(MAM_SPLN_ITM_CONF_R.create("T1"));
			c2 = MCController.create(MAM_DMND_DIV_R.create("T1"));
			c3 = MCController.create(MAM_BP_ITM_R.create("T1"));
			c4 = MCController.create(MAM_ITM_STR_LN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_ITM__R)c0.up(0);
			c0_down0 = (MCList<MAM_ITM__R>)c0.down(0);
			c1_up0 = (MAM_SPLN_ITM_CONF_R)c1.up(0);
			c1_down0 = (MCList<MAM_SPLN_ITM_CONF_R>)c1.down(0);
			c2_up0 = (MAM_DMND_DIV_R)c2.up(0);
			c2_down0 = (MCList<MAM_DMND_DIV_R>)c2.down(0);
			c3_up0 = (MAM_BP_ITM_R)c3.up(0);
			c3_down0 = (MCList<MAM_BP_ITM_R>)c3.down(0);
			c4_up0 = (MAM_ITM_STR_LN_R)c4.up(0);
			c4_down0 = (MCList<MAM_ITM_STR_LN_R>)c4.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_ITM__R （{@link #c0_up0}）<br>
		 * SELECT_SUB1<br>
		 * up0() => MAM_SPLN_ITM_CONF_R （{@link #c1_up0}）<br>
		 * SELECT_SUB2<br>
		 * up0() => MAM_DMND_DIV_R （{@link #c2_up0}）<br>
		 * SELECT_SUB3<br>
		 * up0() => MAM_BP_ITM_R （{@link #c3_up0}）<br>
		 * SELECT_SUB4<br>
		 * up0() => MAM_ITM_STR_LN_R （{@link #c4_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1(c1_up0, up0());
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2(c2_up0, up0());
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3(c3_up0, up0());
			}
			if (key.equals(SELECT_SUB4)) {
				up_SELECT_SUB4(c4_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ITM__R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_SPLN_ITM_CONF_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_DMND_DIV_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;MAM_BP_ITM_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;MAM_ITM_STR_LN_R&gt;（{@link #c4_down0}）=> down4()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down3(), c3_down0);
			}
			if (key.equals(SELECT_SUB4)) {
				down_SELECT_SUB4(down4(), c4_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_SlsItmReg)MABSL_SlsItmReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL1120.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt5R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL1120.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_CndR up0() {
			return up0;
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
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>st_ym</td></tr>
		 * 	<tr><td><br></td><td>end_ym</td></tr>
		 * 	<tr><td><br></td><td>calc_rate</td></tr>
		 * 	<tr><td><br></td><td>calc_seq</td></tr>
		 * 	<tr><td><br></td><td>upri_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_div_ratio</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_SlsItmReg)MABSL_SlsItmReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_ITM__R dest0_0, mcframe.serverMABS.MABSL1120.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_ITM__R dest, mcframe.serverMABS.MABSL1120.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(MAM_SPLN_ITM_CONF_R dest0_0, mcframe.serverMABS.MABSL1120.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB1_c1_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_up_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB1_c1_0(MAM_SPLN_ITM_CONF_R dest, mcframe.serverMABS.MABSL1120.Srch01_CndR src) {
			createMap_up_SELECT_SUB1_c1_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(MAM_DMND_DIV_R dest0_0, mcframe.serverMABS.MABSL1120.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB2_c2_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_up_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB2_c2_0(MAM_DMND_DIV_R dest, mcframe.serverMABS.MABSL1120.Srch01_CndR src) {
			createMap_up_SELECT_SUB2_c2_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(MAM_BP_ITM_R dest0_0, mcframe.serverMABS.MABSL1120.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB3_c3_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_up_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB3_c3_0(MAM_BP_ITM_R dest, mcframe.serverMABS.MABSL1120.Srch01_CndR src) {
			createMap_up_SELECT_SUB3_c3_0().copy(dest, src);
		}
		//-----------------------SELECT_SUB4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB4(MAM_ITM_STR_LN_R dest0_0, mcframe.serverMABS.MABSL1120.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_SUB4_c4_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_up_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理SELECT_SUB4_c4の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_SUB4_c4_0(MAM_ITM_STR_LN_R dest, mcframe.serverMABS.MABSL1120.Srch01_CndR src) {
			createMap_up_SELECT_SUB4_c4_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ITM__R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("asset_mng_typ", "asset_mng_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_dest, MAM_ITM__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> dest, MCList<MAM_ITM__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM__R r_src : src){
				mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_SPLN_ITM_CONF_R> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("spln_itm_cd", "spln_itm_cd");
				addColumnPathMap("spln_itm_nm", "spln_itm_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("st_ym", "st_ym");
				addColumnPathMap("end_ym", "end_ym");
				addColumnPathMap("calc_rate", "calc_rate");
				addColumnPathMap("calc_seq", "calc_seq");
				addColumnPathMap("upri_unit_cd", "upri_unit_cd");
				addColumnPathMap("upri_unit_nm", "upri_unit_nm");
				addColumnPathMap("lot_qty", "lot_qty");
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
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABS.MABSL1120.Srch01_Rslt2R r_dest, MAM_SPLN_ITM_CONF_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt2R> dest, MCList<MAM_SPLN_ITM_CONF_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_SPLN_ITM_CONF_R r_src : src){
				mcframe.serverMABS.MABSL1120.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_DMND_DIV_R> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_lg_grp_cd", "to_lg_grp_cd");
				addColumnPathMap("to_lg_grp_nm", "to_lg_grp_nm");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("ship_loc_nm", "ship_loc_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dmnd_div_ratio", "dmnd_div_ratio");
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
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABS.MABSL1120.Srch01_Rslt3R r_dest, MAM_DMND_DIV_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt3R> dest, MCList<MAM_DMND_DIV_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_DMND_DIV_R r_src : src){
				mcframe.serverMABS.MABSL1120.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_BP_ITM_R> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
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
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABS.MABSL1120.Srch01_Rslt4R r_dest, MAM_BP_ITM_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt4R> dest, MCList<MAM_BP_ITM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(MAM_BP_ITM_R r_src : src){
				mcframe.serverMABS.MABSL1120.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_ITM_STR_LN_R> src0_0){
			down_SELECT_SUB4_c4_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
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
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABS.MABSL1120.Srch01_Rslt5R r_dest, MAM_ITM_STR_LN_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt5R> dest, MCList<MAM_ITM_STR_LN_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(MAM_ITM_STR_LN_R r_src : src){
				mcframe.serverMABS.MABSL1120.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
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
		private final MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> up4;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COM_R> chkMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.SplnItmConf_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.DmndDiv_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.ItmStrLn_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COM_R.create("T1"));
			chk01 = mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.crtSplnItmConf_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0830.MABSL_SplnItmConf.crtSplnItmConf_Upd01();
			chk02 = mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.crtDmndDiv_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0820.MABCL_DmndDivReg.crtDmndDiv_Upd01();
			chk03 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_UpdChk01();
			upd03 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_Upd01();
			chk04 = mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.crtItmStrLn_UpdChk01();
			upd04 = mcframe.serverMABS.MABSL0370.MABSL_ItmStrLnReg.crtItmStrLn_Upd01();
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COM_R>)chkMaster.up(1);
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR>)upd04.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 * CALL_OPE01<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up1());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up2());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up3());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up4());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE04<br>
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
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_SlsItmReg)MABSL_SlsItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1120.Srch01_Rslt1R createUpd01_Dtl1R(){
			return mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>sls_input_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>st_ym_key</td></tr>
		 * 	<tr><td><br></td><td>st_ym</td></tr>
		 * 	<tr><td><br></td><td>end_ym</td></tr>
		 * 	<tr><td><br></td><td>calc_rate</td></tr>
		 * 	<tr><td><br></td><td>calc_seq</td></tr>
		 * 	<tr><td><br></td><td>upri_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_div_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> up4() {
			return up4;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_SlsItmReg)MABSL_SlsItmReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> src_Upd01_Dtl1){
			up_UPDATE_updMaster_0(dest0_0, src_Upd01_Dtl1);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sls_input_flg", "sls_input_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COM_R> dest0_0, MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> src_Upd01_Dtl1){
			up_MAIN_chkMaster_0(dest0_0, src_Upd01_Dtl1);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_COM_R r_dest, mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COM_R> dest, MCList<mcframe.serverMABS.MABSL1120.Srch01_Rslt1R> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL1120.Srch01_Rslt1R r_src : src){
				MAM_ITM_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl2);
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("spln_itm_cd", "spln_itm_cd");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_ym_key", "st_ym_key");
				addColumnPathMap("st_ym", "st_ym");
				addColumnPathMap("end_ym", "end_ym");
				addColumnPathMap("calc_rate", "calc_rate");
				addColumnPathMap("calc_seq", "calc_seq");
				addColumnPathMap("upri_unit_cd", "upri_unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("spln_itm_cd", "spln_itm_cd");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("st_ym_key", "st_ym_key");
				addColumnPathMap("st_ym", "st_ym");
				addColumnPathMap("end_ym", "end_ym");
				addColumnPathMap("calc_rate", "calc_rate");
				addColumnPathMap("calc_seq", "calc_seq");
				addColumnPathMap("upri_unit_cd", "upri_unit_cd");
				addColumnPathMap("lot_qty", "lot_qty");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0830.SplnItmConf_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_lg_grp_cd", "to_lg_grp_cd");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dmnd_div_ratio", "dmnd_div_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("to_lg_grp_cd", "to_lg_grp_cd");
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("ship_loc_cd", "ship_loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dmnd_div_ratio", "dmnd_div_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0820.DmndDiv_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src_Upd01_Dtl4){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl4);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl4);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src_Upd01_Dtl5){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl5);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl5);
		}
		
		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_chk04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_chk04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_upd04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_upd04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("gr_loc_cd", "gr_loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0370.ItmStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
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
		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}